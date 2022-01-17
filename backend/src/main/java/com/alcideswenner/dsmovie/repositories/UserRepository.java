package com.alcideswenner.dsmovie.repositories;

import com.alcideswenner.dsmovie.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
