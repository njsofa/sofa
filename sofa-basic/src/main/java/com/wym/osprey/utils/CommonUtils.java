package com.wym.osprey.utils;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.UUID;

public class CommonUtils {
    /**
     * 获取随机编码（该实现为：UUID去掉横杠之后的数据）
     * @return
     */
    public static String getRandomCode() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 将手机号中间的四位替换为星号
     * @param mobileno
     * @return
     */
    public static String encryMobileno(String mobileno) {
        if (mobileno == null || mobileno.length() < 11) {
            return mobileno;
        }

        StringBuffer buf = new StringBuffer();
        buf.append(mobileno.substring(0, 3));
        buf.append("****");
        buf.append(mobileno.substring(7));
        return buf.toString();
    }

    /**
     * 获取六位随机数字
     * @return
     */
    public static int getCaptchaCode() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }

    /**
     * 截取字符串，如在兴趣爱好、品项中，可能查询出多条记录（超过5条，并可能重复）
     * 返回的字符串将最多包含有五条，并且返回的字符串应尽量包含queryString中的内容
     * @param value
     * @param queryString
     * @return
     */
    public static String cutDownMore(String value, Object[] queryString) {
        if (value == null || value.length() == 0 ||  value.indexOf(",") < 0) {
            return value;
        }

        String[] strs = value.split(",");
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        for (String str : strs) {
            if (str.length() > 0) {
                hashSet.add(str);
            }
        }

        if (hashSet.size() > 5 && queryString != null && queryString.length > 0) {
            LinkedHashSet<String> _tempSet = new LinkedHashSet<>();
            for (Object obj : queryString) {
                String str = String.valueOf(obj);
                if (hashSet.contains(str)) {
                    _tempSet.add(str);
                }
            }

            for (String str : hashSet) {
                if (_tempSet.size() < 5) {
                    if (str.length() > 0) {
                        _tempSet.add(str);
                    }
                }
                else {
                    break;
                }
            }

            hashSet = _tempSet;
        }

        int index = 0;
        StringBuffer buf = new StringBuffer();
        for (String str : hashSet) {
            if (index >= 5) {
                break;
            }
            if (buf.length() > 0) {
                buf.append(",");
            }
            buf.append(str);

            index++;
        }
        return buf.toString();
    }

    public static void main(String[] args) {

    }
}
