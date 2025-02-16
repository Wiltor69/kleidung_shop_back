package com.team_challenge.clothing_store.dao;

import com.team_challenge.clothing_store.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByEmail(String email);

}
