package com.ynova.hotel_service.service;

import java.util.List;

import com.ynova.hotel_service.entity.Hotel;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAll();

    Hotel getById(Long id);
}
