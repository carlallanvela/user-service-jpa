package com.cvela.learning.jpa.userservicejpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvela.learning.jpa.userservicejpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
