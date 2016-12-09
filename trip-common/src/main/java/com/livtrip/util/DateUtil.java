package com.livtrip.util;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by tangdu on 2016/12/8.
 */
public class DateUtil {
    public static String formateDefault(Date date){
        return new DateTime(date).toString("yyyyMMdd");
    }

    public static String formateYmd(Date date){
        return new DateTime(date).toString("yyyy-MM-dd");
    }
}
