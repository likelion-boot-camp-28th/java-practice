package com.ohgiraffers.api.hair.model.dto;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String birthday; //2020/11/19 > 2020-11-19로 출력되게 해야함.
    private String reservationDate;
    private String reservationTime;
    private String createdAt;

    public User(String id, String firstName, String lastName, String email, String gender, String birthday, String reservationDate, String reservationTime, String createdAt) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday.replace('/','-') + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", reservationTime='" + reservationTime + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
