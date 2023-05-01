package com.ssafy.enjoytrip.plan.dto;

import com.ssafy.enjoytrip.attraction.dto.AttractionDto;

import java.util.List;

public class PlanDto {
    private String planWriter;
    private String planTitle;
    private String startDate;
    private String endDate;
    private String regDate;
    private int scrapCount;
    private List<AttractionDto> planCards;

    public String getPlanWriter() {
        return planWriter;
    }

    public void setPlanWriter(String planWriter) {
        this.planWriter = planWriter;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    public void setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getScrapCount() {
        return scrapCount;
    }

    public void setScrapCount(int scrapCount) {
        this.scrapCount = scrapCount;
    }

    public List<AttractionDto> getPlanCards() {
        return planCards;
    }

    public void setPlanCards(List<AttractionDto> planCards) {
        this.planCards = planCards;
    }

    @Override
    public String toString() {
        return "PlanDto{" +
                "planWriter='" + planWriter + '\'' +
                ", planTitle='" + planTitle + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", regDate='" + regDate + '\'' +
                ", scrapCount=" + scrapCount +
                ", planCards=" + planCards +
                '}';
    }
}
