package com.user.userMicroserviceService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.userMicroserviceService.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
