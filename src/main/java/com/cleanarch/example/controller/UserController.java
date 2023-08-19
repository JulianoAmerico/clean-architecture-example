package com.cleanarch.example.controller;

import com.cleanarch.example.controller.model.UserRequest;
import com.cleanarch.example.controller.model.UserResponse;
import com.cleanarch.example.domain.User;
import com.cleanarch.example.usecase.UserUseCase;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @PostMapping
    public UserResponse save(@RequestBody @Valid UserRequest request) {
        var user = userUseCase.save(User.builder()
                .login(request.login())
                .password(request.password())
                .build());
        return new UserResponse(user.getId(), user.getCreatedAt(), user.getUpdatedAt());
    }

    @PutMapping("/{id}")
    public UserResponse update(@PathVariable UUID id,
                               @RequestBody @Valid UserRequest request) {
        var user = userUseCase.update(User.builder()
                .id(id)
                .login(request.login())
                .password(request.password())
                .build());
        return new UserResponse(user.getId(), user.getCreatedAt(), user.getUpdatedAt());
    }

    @GetMapping
    public List<UserResponse> getAll() {
        return userUseCase.getAll()
                .stream()
                .map(user -> new UserResponse(user.getId(), user.getCreatedAt(), user.getUpdatedAt()))
                .toList();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable @NotNull(message = "invalid") UUID id) {
        userUseCase.delete(id);
    }
}
