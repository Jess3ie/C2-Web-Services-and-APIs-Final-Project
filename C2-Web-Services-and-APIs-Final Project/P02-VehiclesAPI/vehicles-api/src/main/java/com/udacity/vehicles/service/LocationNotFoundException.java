package com.udacity.vehicles.service;

public class LocationNotFoundException extends RuntimeException {
    public LocationNotFoundException() {
        super("Location not found");
    }
}
