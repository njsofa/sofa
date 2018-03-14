package com.wym.osprey.enums;

public enum SiteCloudMessageStatus {
    FINISH("已完成"),

    CANCEL("已取消");

    private String remark;

    SiteCloudMessageStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
