package com.cleanarch.example.usecase;

import com.cleanarch.example.domain.Address;
import com.cleanarch.example.gateway.GetAddressByZipCodeGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetAddressByZipCodeUseCase {

    private final GetAddressByZipCodeGateway getAddressByZipCodeGateway;

    public Address execute(String zipCode) {
        return getAddressByZipCodeGateway.execute(zipCode);
    }
}
