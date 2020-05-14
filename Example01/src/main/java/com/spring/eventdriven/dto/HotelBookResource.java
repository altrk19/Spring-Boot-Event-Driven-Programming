package com.spring.eventdriven.dto;

public class HotelBookResource {
    private String userId;
    private String hotelId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "HotelBookRequest{" +
                "userId='" + userId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                '}';
    }
}