package com.spring_boot_BatchAPI.repository;

import com.spring_boot_BatchAPI.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
}
