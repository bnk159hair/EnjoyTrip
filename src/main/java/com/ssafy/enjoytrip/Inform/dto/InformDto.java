package com.ssafy.enjoytrip.Inform.dto;

public class InformDto {
    private int informId;
    private String informWriter;
    private String informTitle;
    private String infromContent;
    private String regDate;
    private int hits;

    public int getInformId() {
        return informId;
    }

    public void setInformId(int informId) {
        this.informId = informId;
    }

    public String getInformWriter() {
        return informWriter;
    }

    public void setInformWriter(String informWriter) {
        this.informWriter = informWriter;
    }

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle;
    }

    public String getInfromContent() {
        return infromContent;
    }

    public void setInfromContent(String infromContent) {
        this.infromContent = infromContent;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "InformDto{" +
                "informId=" + informId +
                ", informWriter='" + informWriter + '\'' +
                ", informTitle='" + informTitle + '\'' +
                ", infromContent='" + infromContent + '\'' +
                ", regDate='" + regDate + '\'' +
                ", hits=" + hits +
                '}';
    }
}
