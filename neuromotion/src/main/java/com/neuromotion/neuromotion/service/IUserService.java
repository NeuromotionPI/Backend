package com.neuromotion.neuromotion.service;


import com.neuromotion.neuromotion.model.UserEntity;
import org.springframework.http.ResponseEntity;

public interface IUserService {

    ResponseEntity<UserEntity> create(UserEntity userEntity);

}
