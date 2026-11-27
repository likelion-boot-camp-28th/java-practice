package com.ohgiraffers.section04.singleton.basic.calendar.start;

public class ReservationScreen {

    public void check(String date) {
        // TODO 단계 2: ReservationScreen과 DeliveryScreen의 new HolidayCalendar()를 HolidayCalendar.getInstance()로 바꾼다
        HolidayCalendar calendar = HolidayCalendar.getInstance();
        if (calendar.isHoliday(date)) {
            System.out.println("예약 " + date + ": 쉬는 날");
        } else {
            System.out.println("예약 " + date + ": 예약 가능");
        }
    }
}