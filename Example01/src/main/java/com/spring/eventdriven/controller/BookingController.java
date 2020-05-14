package com.spring.eventdriven.controller;

import com.spring.eventdriven.dto.HotelBookResource;
import com.spring.eventdriven.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookingController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public void bookHotel(@RequestBody HotelBookResource hotelBook) {
        reservationService.publishReservationEvent(hotelBook);
        System.out.println("User request processed" + hotelBook);
    }
}

//POST localhost:8080/book
//{
//        "userId":"123",
//        "hotelId":"456"
//
//}