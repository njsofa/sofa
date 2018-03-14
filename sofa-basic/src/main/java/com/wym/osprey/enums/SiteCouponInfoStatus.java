package com.wym.osprey.enums;

import java.util.HashMap;
import java.util.Map;

public enum SiteCouponInfoStatus {
    NORMAL("启用"),

    DEMISE("停用");
    private String remark;

    SiteCouponInfoStatus(String remak) {
        this.remark = remak;
    }

    public String getRemark() {
        return this.remark;
    }
    private static Map<String, SiteCouponInfoStatus> map = new HashMap<String, SiteCouponInfoStatus>();

    static {
        for (SiteCouponInfoStatus status : SiteCouponInfoStatus.values()) {
            map.put(status.name(), status);
        }
    }

    public static SiteCouponInfoStatus getStatus(String key) {
        return map.get(key);
    }
}
