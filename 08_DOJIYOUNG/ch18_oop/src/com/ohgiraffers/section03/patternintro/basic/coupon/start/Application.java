package com.ohgiraffers.section03.patternintro.basic.coupon.start;

public class Application {

    public static void main(String[] args) {

        /* 문장 하나짜리 쿠폰 문구를 머리말, 본문, 조립 클래스 세 개에 나눠 만든다. */
        // TODO 단계 1: 같은 패키지에 쿠폰 문구 전체를 돌려주는 make(String name) 메소드를 가진 BirthdayCoupon 클래스를 만든다
        // TODO 단계 2: 아래 세 줄이 CouponService 대신 BirthdayCoupon을 쓰게 바꾼다
        //CouponService service = new CouponService();
        BirthdayCoupon coupon = new BirthdayCoupon();
        System.out.println(coupon.make("김하늘"));
        System.out.println(coupon.make("이바다"));

        // TODO 단계 4: 쿠폰 문구 끝에 " (12월 31일까지)"를 붙인다
    }
}