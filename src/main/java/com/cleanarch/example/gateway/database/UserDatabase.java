package com.cleanarch.example.gateway.database;


import com.cleanarch.example.domain.User;
import com.cleanarch.example.gateway.UserGateway;
import com.cleanarch.example.gateway.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserDatabase implements UserGateway {

    private final UserRepository repository;

    @Override
    public User save(User user) {
        try {
            return repository.save(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(UUID id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
