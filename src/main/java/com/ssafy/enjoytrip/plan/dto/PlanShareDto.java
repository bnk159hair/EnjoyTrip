package com.ssafy.enjoytrip.plan.dto;

public class PlanShareDto {
    private int shareId;
    private String ownerId;
    private String participantId;
    private String planId;

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

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    @Override
    public String toString() {
        return "PlanShareDto{" +
                "shareId=" + shareId +
                ", ownerId='" + ownerId + '\'' +
                ", participantId='" + participantId + '\'' +
                ", planId='" + planId + '\'' +
                '}';
    }
}
