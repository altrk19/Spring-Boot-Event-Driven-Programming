package com.spring.eventdriven.service;

import com.spring.eventdriven.dto.HotelBookResource;

public interface ReservationService {
    void publishReservationEvent(HotelBookResource hotelBook);
}
