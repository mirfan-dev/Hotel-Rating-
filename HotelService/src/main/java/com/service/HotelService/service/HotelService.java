package com.service.HotelService.service;

import com.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {


    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
