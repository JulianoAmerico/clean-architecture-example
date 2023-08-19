package com.cleanarch.example.controller.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record UserResponse(
        UUID id,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
