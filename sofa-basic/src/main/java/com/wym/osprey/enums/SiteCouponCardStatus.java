package com.wym.osprey.enums;

import java.util.HashMap;
import java.util.Map;

public enum SiteCouponCardStatus {
    CREATE("未使用"),

    LOCKED("已锁定"),

    USED("已使用"),

    EXPIRED("已过期"),

    CANCEL("已删除");

    private String remark;

    SiteCouponCardStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
    private static Map<String, SiteCouponCardStatus> map = new HashMap<String, SiteCouponCardStatus>();

    static {
        for (SiteCouponCardStatus status : SiteCouponCardStatus.values()) {
            map.put(status.name(), status);
        }
    }

    public static SiteCouponCardStatus getStatus(String key) {
        return map.get(key);
    }
}
