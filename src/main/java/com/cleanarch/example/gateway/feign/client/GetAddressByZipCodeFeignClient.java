package com.cleanarch.example.gateway.feign.client;

import com.cleanarch.example.gateway.feign.client.model.AddressFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${zipCode.url}", name = "GetAddressByZipCodeFeignClient")
public interface GetAddressByZipCodeFeignClient {

    @GetMapping("/ws/{zipCode}/json")
    AddressFeignResponse execute(@PathVariable String zipCode);
}
