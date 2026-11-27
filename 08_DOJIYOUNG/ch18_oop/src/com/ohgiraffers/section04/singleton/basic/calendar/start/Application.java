package com.ohgiraffers.section04.singleton.basic.calendar.start;

public class Application {

    public static void main(String[] args) {

        System.out.println("[앱 시작]");
        ReservationScreen reservation = new ReservationScreen();
        DeliveryScreen delivery = new DeliveryScreen();

        reservation.check("12-25");
        delivery.check("12-24");
        reservation.check("01-01");
    }
}