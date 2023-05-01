package com.ssafy.enjoytrip.Inform.dto;

public class InformDto {
    private int informId;
    private String informWriter;
    private String informTitle;
    private String informContent;
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

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent;
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
                ", informContent='" + informContent + '\'' +
                ", regDate='" + regDate + '\'' +
                ", hits=" + hits +
                '}';
    }
}

