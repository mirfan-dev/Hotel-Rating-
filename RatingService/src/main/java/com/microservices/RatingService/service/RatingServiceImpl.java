package com.microservices.RatingService.service;

import com.microservices.RatingService.entities.Rating;
import com.microservices.RatingService.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{


    @Autowired
    private RatingRepository repository;

    @Override
    public Rating create(Rating rating) {
        String randomUserId= UUID.randomUUID().toString();
        rating.setRatingId(randomUserId);
        return repository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}
