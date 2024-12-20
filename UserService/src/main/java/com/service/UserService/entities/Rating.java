package com.service.UserService.entities;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
    private Hotel hotel;
}
