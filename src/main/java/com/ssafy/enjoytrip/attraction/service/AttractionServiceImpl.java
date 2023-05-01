package com.ssafy.enjoytrip.attraction.service;

import com.ssafy.enjoytrip.attraction.mapper.AttractionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttractionServiceImpl implements AttractionService {
    private AttractionMapper attractionMapper;

    @Autowired
    public AttractionServiceImpl(AttractionMapper attractionMapper) {
        this.attractionMapper = attractionMapper;
    }
}
