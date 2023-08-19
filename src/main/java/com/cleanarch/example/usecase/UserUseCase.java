package com.cleanarch.example.usecase;

import com.cleanarch.example.domain.User;
import com.cleanarch.example.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserUseCase {

    private final UserGateway gateway;

    public User save(User user) {
        return gateway.save(user);
    }

    public User update(User user) {
        return gateway.save(user);
    }

    public List<User> getAll() {
        return gateway.getAll();
    }

    public void delete(UUID id) {
        gateway.delete(id);
    }
}
