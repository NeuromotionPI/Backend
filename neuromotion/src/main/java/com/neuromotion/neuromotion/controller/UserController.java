package com.neuromotion.neuromotion.controller;


import com.neuromotion.neuromotion.model.UserEntity;
import com.neuromotion.neuromotion.service.IUserService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final IUserService iUserService;
    @PostMapping
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity userEntity){
        return  this.iUserService.create(userEntity);
    }


}
