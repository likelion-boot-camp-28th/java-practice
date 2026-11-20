package com.ohgiraffers.level01.basic.parse.run;

public class Application {
    public static void main(String[] args) {
        /**
         * 문자열 배열 {"10", "abc", "30", "4.5"}의 값을 차례로 정수로 바꿔 더한다.
         * 바꿀 수 없는 값은 변환 실패 : <값>을 출력하고 건너뛴다.
         * 끝나면 합계 : <N>, 실패 건수 : <N>을 출력한다.**/
        // 1. 정수로 바꿀 문자열 배열을 만든다
        String[] sArr = new String[]{"10", "abc", "30", "4.5"};

        // 2. 합계와 실패 건수를 담을 변수를 만든다
        int sum = 0;
        int failCnt = 0;

        // 3. 값마다 정수로 바꿔 더하고, 바꿀 수 없는 값은 알린 뒤 건너뛴다
        for(String s:sArr){
            try{
                int i = Integer.parseInt(s);
                sum+=i;
            }catch (NumberFormatException exception){
                System.out.println("변환 실패 : "+ s);
                failCnt++;
            }
        }

        // 4. 합계와 실패 건수를 출력한다
        System.out.println("합계  : "+sum);
        System.out.println("실패 건수 : "+failCnt);
    }
}
