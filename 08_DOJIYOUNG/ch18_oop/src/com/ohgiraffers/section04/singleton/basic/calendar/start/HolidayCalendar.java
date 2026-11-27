package com.ohgiraffers.section04.singleton.basic.calendar.start;

/* 공휴일 달력이다. 달력을 불러오는 데 시간이 걸린다고 가정하고, 불러올 때 한 줄을 출력한다. */
public class HolidayCalendar {

    // TODO 단계 3: 다른 클래스에서 new 하지 못하게 생성자를 private으로 바꾼다
    private HolidayCalendar() {
        System.out.println("(공휴일 달력을 불러왔다)");
    }

    // TODO 단계 1: 객체 하나를 담는 static 중첩 클래스 Holder와, Holder.INSTANCE를 돌려주는 static 메소드 getInstance()를 만든다
    private static class Holder{
        private static final HolidayCalendar INSTANCE = new HolidayCalendar();
    }
    public static HolidayCalendar getInstance(){
        return Holder.INSTANCE;
    }

    public boolean isHoliday(String date) {
        return date.equals("01-01") || date.equals("12-25");
    }
}