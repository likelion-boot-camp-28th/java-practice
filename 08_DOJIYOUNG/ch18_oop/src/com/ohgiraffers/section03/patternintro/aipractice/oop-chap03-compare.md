# OOP Chap03 리뷰 자료: 패턴을 쓸지 말지 비교

구조 A = optiona, 구조 B = optionb. 두 구조는 실행 결과가 같다.

## optiona/Application.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optiona;

public class Application {

    public static void main(String[] args) {

        /* 구조 A: 머리글은 ReceiptPrinter의 메소드 하나가 만든다. */
        ReceiptPrinter printer = new ReceiptPrinter();

        printer.print("BK-0001", 32400);
        printer.print("BK-0002", 23900);
    }
}
```

## optiona/ReceiptPrinter.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optiona;

public class ReceiptPrinter {

    public void print(String orderNo, int amount) {
        System.out.println(header());
        System.out.println("주문 번호: " + orderNo);
        System.out.println("결제 금액: " + amount);
    }

    private String header() {
        return "==== 서점 영수증 ====";
    }
}
```

## optionb/Application.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class Application {

    public static void main(String[] args) {

        /* 구조 B: 머리글 모양을 HeaderFormat 인터페이스와 구현 클래스 두 개로 나눴다. 실제로 쓰는 것은 LineHeader 하나다. */
        ReceiptPrinter printer = new ReceiptPrinter(new LineHeader());

        printer.print("BK-0001", 32400);
        printer.print("BK-0002", 23900);
    }
}
```

## optionb/BoxHeader.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class BoxHeader implements HeaderFormat {

    @Override
    public String header(String title) {
        return "[ " + title + " ]";
    }
}
```

## optionb/HeaderFormat.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public interface HeaderFormat {

    String header(String title);
}
```

## optionb/LineHeader.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class LineHeader implements HeaderFormat {

    @Override
    public String header(String title) {
        return "==== " + title + " ====";
    }
}
```

## optionb/ReceiptPrinter.java

```java
package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class ReceiptPrinter {

    private static final String TITLE = "서점 영수증";

    private HeaderFormat headerFormat;

    public ReceiptPrinter(HeaderFormat headerFormat) {
        this.headerFormat = headerFormat;
    }

    public void print(String orderNo, int amount) {
        System.out.println(headerFormat.header(TITLE));
        System.out.println("주문 번호: " + orderNo);
        System.out.println("결제 금액: " + amount);
    }
}
```
