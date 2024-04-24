package com.neuromotion.neuromotion.repository;

import com.neuromotion.neuromotion.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {
}
