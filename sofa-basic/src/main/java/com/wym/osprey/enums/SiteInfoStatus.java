package com.wym.osprey.enums;

public enum SiteInfoStatus {
    NORMAL("正常"),

    FROZEN("冻结"),

    DEMISE("注销");

    private String remark;

    SiteInfoStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
