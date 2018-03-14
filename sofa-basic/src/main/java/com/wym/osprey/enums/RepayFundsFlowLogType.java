package com.wym.osprey.enums;

public enum RepayFundsFlowLogType {
    IN("入金"),

    OUT("出金"),

    ADJUST("内部调整");

    private String remark;

    RepayFundsFlowLogType(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
