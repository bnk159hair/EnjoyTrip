package com.ssafy.enjoytrip.plan.dto;

import java.util.List;

public class PlanDto {
    private String plan_writer;
    private String plan_title;
    private String start_date;
    private String end_date;
    private String reg_date;
    private int scrap_count;

    private List<AttractionDto> plancards;

    public String getPlan_writer() {
        return plan_writer;
    }

    public void setPlan_writer(String plan_writer) {
        this.plan_writer = plan_writer;
    }

    public String getPlan_title() {
        return plan_title;
    }

    public void setPlan_title(String plan_title) {
        this.plan_title = plan_title;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public int getScrap_count() {
        return scrap_count;
    }

    public void setScrap_count(int scrap_count) {
        this.scrap_count = scrap_count;
    }

    public List<AttractionDto> getPlancards() {
        return plancards;
    }

    public void setPlancards(List<AttractionDto> plancards) {
        this.plancards = plancards;
    }

    @Override
    public String toString() {
        return "PlanDto{" +
                "plan_writer='" + plan_writer + '\'' +
                ", plan_title='" + plan_title + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", reg_date='" + reg_date + '\'' +
                ", scrap_count=" + scrap_count +
                ", plancards=" + plancards +
                '}';
    }
}
