package com.wym.osprey.enums;

public enum RepayMemberTaskStatus {
    CREATE("创建"),

    FINISH("完成"),

    FAILED("失败"),

    CANCEL("取消");

    private String remark;

    RepayMemberTaskStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
}
