package com.team_challenge.clothing_store.service;

import com.team_challenge.clothing_store.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean save(UserDTO userDTO);
}
