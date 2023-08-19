package com.cleanarch.example.gateway;

import com.cleanarch.example.domain.User;

import java.util.List;
import java.util.UUID;

public interface UserGateway {
    User save (User user);
    List<User> getAll();
    void delete(UUID id);
}
