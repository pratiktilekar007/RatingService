package com.lcwd.rating.service;

import com.lcwd.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //getAllRating
    List<Rating> getAllRating();

    //getALLByUserId
    List<Rating> getAllRatingByUserId(String userId);

    //getAllByHotel
    List<Rating> getAllRatingByHotelId(String hotelId);



}
