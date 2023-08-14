package com.cleanarch.example.gateway.feign;

import com.cleanarch.example.domain.Address;
import com.cleanarch.example.gateway.GetAddressByZipCodeGateway;
import com.cleanarch.example.gateway.feign.client.GetAddressByZipCodeFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetAddressByZipCodeGatewayImpl implements GetAddressByZipCodeGateway {

    private final GetAddressByZipCodeFeignClient client;

    @Override
    public Address execute(String zipCode) {
        return new Address(client.execute(zipCode).city());
    }
}
