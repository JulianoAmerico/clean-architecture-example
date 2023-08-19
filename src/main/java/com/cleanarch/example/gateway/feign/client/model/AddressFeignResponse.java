package com.cleanarch.example.gateway.feign.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AddressFeignResponse(
        @JsonProperty("localidade")
        String city
) {
}
