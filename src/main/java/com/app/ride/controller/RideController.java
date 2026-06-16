package com.app.ride.controller;

import org.springframework.web.bind.annotation.*;
import com.app.ride.service.RideService;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final RideService service = new RideService();

    @GetMapping
    public String getRides() {
        return service.getRides();
    }
}