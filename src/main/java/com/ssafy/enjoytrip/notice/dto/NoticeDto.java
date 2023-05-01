package com.ssafy.enjoytrip.notice.dto;

public class NoticeDto {
    private int noticeId;
    private String noticeReceiver;
    private int planId;
    private int reviewId;
    private String content;
    private String receiveDate;
    private int readCheck;

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public void setNoticeReceiver(String noticeReceiver) {
        this.noticeReceiver = noticeReceiver;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public void setReadCheck(int readCheck) {
        this.readCheck = readCheck;
    }

    @Override
    public String toString() {
        return "NoticeDto{" +
                "noticeId=" + noticeId +
                ", noticeReceiver='" + noticeReceiver + '\'' +
                ", planId=" + planId +
                ", reviewId=" + reviewId +
                ", content='" + content + '\'' +
                ", receiveDate='" + receiveDate + '\'' +
                ", readCheck=" + readCheck +
                '}';
    }
}
