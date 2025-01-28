package com.example.travelappcalculatefare.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.travelappcalculatefare.model.Cab;

@Service
public class FareService {

	public List<Cab> calculateFares(List<Cab> cabs) {
        // Calculate fare for each cab (distance * £2)
        return cabs.stream()
                   .map(cab -> {
                       cab.setFare(cab.getDistance() * 2);
                       return cab;
                   })
                   .collect(Collectors.toList());
    }
}
