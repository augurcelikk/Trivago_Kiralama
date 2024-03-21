package com.ugur.repository;

import com.ugur.repository.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<Auth,Long> {
    Optional<Auth> findOptionalByUserNameAndPassword(String userName,String password);

    Optional<Auth> findOptionalByUserName(String userName);
}
