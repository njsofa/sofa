package com.wym.osprey.enums;

public enum RepayMemberInfoStatus {
    NORMAL("正常"),

    CANCEL("关闭资格");

    private String remark;

    RepayMemberInfoStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
