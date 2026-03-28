package com.url.shortener.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.url.shortener.Models.Users;

public interface UserRepository  extends JpaRepository<Users, Long>{
    Optional<Users> findByUsername(String username);

    
} 