package com.ssafy.enjoytrip.Inform.service;

import com.ssafy.enjoytrip.Inform.mapper.InformMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformServiceImpl implements InformService {
    private InformMapper informMapper;

    @Autowired
    public InformServiceImpl(InformMapper informMapper) {
        this.informMapper = informMapper;
    }
}
