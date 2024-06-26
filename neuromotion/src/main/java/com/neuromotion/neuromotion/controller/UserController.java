package com.neuromotion.neuromotion.controller;


import com.neuromotion.neuromotion.model.UserEntity;
import com.neuromotion.neuromotion.service.IUserService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final IUserService iUserService;
    @PostMapping
    public ResponseEntity<UserEntity> create(@RequestBody UserEntity userEntity){
        return  this.iUserService.create(userEntity);
    }
    @GetMapping
    public ResponseEntity<List<UserEntity>> findAll(){
        return this.iUserService.geAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserEntity>getById(@PathVariable("id")String id){
        return this.iUserService.getByid(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>delete(@PathVariable ("id") String id){
        return this.iUserService.deleteById(id);
    }
}
