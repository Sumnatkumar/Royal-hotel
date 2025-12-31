package com.sumant.PhegonHotelMongo.service.interfac;


import com.sumant.PhegonHotelMongo.dto.Response;
import com.sumant.PhegonHotelMongo.entity.Booking;

public interface IBookingService {

    Response saveBooking(String rooId, String userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(String bookingId);
}
