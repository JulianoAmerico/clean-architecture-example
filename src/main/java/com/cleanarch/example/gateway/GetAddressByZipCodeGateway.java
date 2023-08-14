package com.cleanarch.example.gateway;

import com.cleanarch.example.domain.Address;

public interface GetAddressByZipCodeGateway {

    Address execute(String zipCode);
}
