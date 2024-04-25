package com.neuromotion.neuromotion.impl;

import com.neuromotion.neuromotion.model.UserEntity;
import com.neuromotion.neuromotion.repository.UserRepository;
import com.neuromotion.neuromotion.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<UserEntity> create(UserEntity userEntity) {

        var newUser= this.userRepository.save(userEntity);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser);
    }

    @Override
    public ResponseEntity<List<UserEntity>> geAll() {
        var userList = this.userRepository.findAll();
        return ResponseEntity.ok(userList);
    }

    @Override
    public ResponseEntity<UserEntity> getByid(String id) {
        var user = this.userRepository.findById(id);

        return user
                .map(ResponseEntity::ok)
                .orElseGet(
                        () -> ResponseEntity
                                .status(HttpStatus.NOT_FOUND)
                                .build()
                );
    }

    @Override
    public ResponseEntity<?> deleteById(String id) {
        this.userRepository.deleteById(id);
        return ResponseEntity
                .ok()
                .build();
    }
}
