package com.ssafy.enjoytrip.review.dto;

import java.util.List;

public class ReviewDto {
    private String reviewWriter;
    private String reviewTitle;
    private String reviewContent;
    private String regDate;
    private int hits;
    private List<ReviewReplyDto> reviewReplies;

    public String getReviewWriter() {
        return reviewWriter;
    }

    public void setReviewWriter(String reviewWriter) {
        this.reviewWriter = reviewWriter;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
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

    public List<ReviewReplyDto> getReviewReplies() {
        return reviewReplies;
    }

    public void setReviewReplies(List<ReviewReplyDto> reviewReplies) {
        this.reviewReplies = reviewReplies;
    }

    @Override
    public String toString() {
        return "ReviewDto{" +
                "reviewWriter='" + reviewWriter + '\'' +
                ", reviewTitle='" + reviewTitle + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                ", regDate='" + regDate + '\'' +
                ", hits=" + hits +
                ", reviewReplies=" + reviewReplies +
                '}';
    }
}
