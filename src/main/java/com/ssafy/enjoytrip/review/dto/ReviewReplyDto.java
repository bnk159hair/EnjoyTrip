package com.ssafy.enjoytrip.review.dto;

public class ReviewReplyDto {
    private String replyWriter;
    private String replyContent;
    private String regDate;

    public String getReplyWriter() {
        return replyWriter;
    }

    public void setReplyWriter(String replyWriter) {
        this.replyWriter = replyWriter;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "ReviewReplyDto{" +
                "replyWriter='" + replyWriter + '\'' +
                ", replyContent='" + replyContent + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }
}
