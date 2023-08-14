package com.cleanarch.example.controller;

import com.cleanarch.example.controller.model.AddressResponse;
import com.cleanarch.example.usecase.GetAddressByZipCodeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetAddressByZipCodeController {

    private final GetAddressByZipCodeUseCase getAddressByZipCodeUseCase;

    @GetMapping("/address/{zipCode}")
    public AddressResponse execute(@PathVariable String zipCode) {
        return new AddressResponse(getAddressByZipCodeUseCase.execute(zipCode).getCity());
    }
}
