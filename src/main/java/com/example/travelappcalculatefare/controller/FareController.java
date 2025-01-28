package com.example.travelappcalculatefare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.travelappcalculatefare.model.Cab;
import com.example.travelappcalculatefare.service.FareService;

@RestController
public class FareController {

	@Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FareService fareService;

    private String cabsServiceUrl = "http://localhost:8080/cabs";

    @GetMapping("/fares")
    public List<Cab> getCabsWithFares() {
        // Fetch cabs from travelapp service
        ResponseEntity<List<Cab>> response = restTemplate.exchange(
            cabsServiceUrl,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Cab>>() {}
        );
        List<Cab> cabs = response.getBody();

        return fareService.calculateFares(cabs);
    }
}
