package com.ohgiraffers.section04.singleton.basic.calendar.start;

public class DeliveryScreen {

    public void check(String date) {
        HolidayCalendar calendar = HolidayCalendar.getInstance();
        if (calendar.isHoliday(date)) {
            System.out.println("배송 " + date + ": 쉬는 날");
        } else {
            System.out.println("배송 " + date + ": 배송 가능");
        }
    }
}