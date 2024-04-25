package com.neuromotion.neuromotion.service;


import com.neuromotion.neuromotion.model.UserEntity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {

    ResponseEntity<UserEntity> create(UserEntity userEntity);

    ResponseEntity<List<UserEntity>> geAll();

    ResponseEntity<UserEntity> getByid(String id);

    ResponseEntity<?> deleteById(String id);
}
