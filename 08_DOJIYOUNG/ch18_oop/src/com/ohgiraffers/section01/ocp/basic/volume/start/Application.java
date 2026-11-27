package com.ohgiraffers.section01.ocp.basic.volume.start;

public class Application {

    public static void main(String[] args) {

        /*
         * 음량 버튼을 누를 때마다 바깥 코드가 level 필드를 직접 바꾼다.
         * 「0부터 10까지」 규칙은 반복문 안의 if에 있다.
         * 마지막 대입 줄은 if를 거치지 않고 level을 바꾼다.
         * */
        Volume volume = new Volume();

        // TODO 단계 4: 두 반복문 안의 if 묶음은 up()·down() 호출로, 출력 줄의 volume.level은 getLevel() 호출로 바꾼다
        for (int i = 0; i < 12; i++) {
           volume.up();
        }
        System.out.println("위로 12번 누른 뒤 음량: " + volume.getLevel());

        for (int i = 0; i < 15; i++) {
            volume.down();
        }
        System.out.println("아래로 15번 누른 뒤 음량: " + volume.getLevel());

        System.out.println("마지막 음량: " + volume.getLevel());
    }
}