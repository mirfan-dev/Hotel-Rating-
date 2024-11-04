package com.service.UserService.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    private  String id;
    private  String name;
    private  String location;
    private  String about;
}
