package com.spring.eventdriven.service;

import com.spring.eventdriven.event.ReservationCreatedEvent;
import com.spring.eventdriven.dto.HotelBookResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Async
    @Override
    public void publishReservationEvent(HotelBookResource hotelBook){
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("event published");
        applicationEventPublisher.publishEvent(new ReservationCreatedEvent(hotelBook));
    }
}
