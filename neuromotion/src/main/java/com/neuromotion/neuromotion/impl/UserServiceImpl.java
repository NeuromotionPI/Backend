package com.neuromotion.neuromotion.impl;

import com.neuromotion.neuromotion.model.UserEntity;
import com.neuromotion.neuromotion.repository.UserRepository;
import com.neuromotion.neuromotion.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
}
