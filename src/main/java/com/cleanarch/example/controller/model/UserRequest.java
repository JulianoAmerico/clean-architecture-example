package com.cleanarch.example.controller.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

@JsonIgnoreProperties(ignoreUnknown = true)
public record UserRequest(
        @NotBlank(message = "invalid login or password")
        String login,
        @NotBlank(message = "invalid login or password")
        String password
) {
}
