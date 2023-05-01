package com.ssafy.enjoytrip.Inform.controller;

import com.ssafy.enjoytrip.Inform.service.InformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformController {
    private InformService informService;

    @Autowired
    public InformController(InformService informService) {
        this.informService = informService;
    }
}
