package com.wym.osprey.enums;

public enum RewardType {
    CASH("现金"),

    OTHER("其他");

    private String remark;

    RewardType(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
