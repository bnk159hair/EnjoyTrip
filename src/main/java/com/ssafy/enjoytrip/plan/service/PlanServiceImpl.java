package com.ssafy.enjoytrip.plan.service;

import com.ssafy.enjoytrip.plan.mapper.PlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {
    private PlanMapper planMapper;

    @Autowired
    public PlanServiceImpl(PlanMapper planMapper) {
        this.planMapper = planMapper;
    }
}
