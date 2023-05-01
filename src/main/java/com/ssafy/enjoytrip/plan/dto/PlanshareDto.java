package com.ssafy.enjoytrip.planshare.dto;

public class PlanshareDto {
    private int shareId;
    private String ownerId;
    private String participantId;

    public int getShareId() {
        return shareId;
    }

    public void setShareId(int shareId) {
        this.shareId = shareId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    @Override
    public String toString() {
        return "PlanshareDto{" +
                "shareId=" + shareId +
                ", ownerId='" + ownerId + '\'' +
                ", participantId='" + participantId + '\'' +
                '}';
    }
}
