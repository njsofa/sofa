package com.wym.osprey.enums;

public enum SiteRepayGradeStatus {
    NORMAL("开启"),

    FROZEN("停用");

    private String remark;

    SiteRepayGradeStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
