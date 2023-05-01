package com.ssafy.enjoytrip.attraction.controller;

import com.ssafy.enjoytrip.attraction.service.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttractionController {
    private AttractionService attractionService;

    @Autowired
    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }
}
