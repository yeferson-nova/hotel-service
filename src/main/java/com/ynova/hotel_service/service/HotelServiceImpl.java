package com.ynova.hotel_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynova.hotel_service.entity.Hotel;
import com.ynova.hotel_service.exceptions.ResourceNotFoudException;
import com.ynova.hotel_service.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getById(Long id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoudException("Hotel not found"));
    }

}
