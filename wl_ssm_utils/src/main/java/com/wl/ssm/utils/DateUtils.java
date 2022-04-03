package com.wl.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
public class DateUtils {


    /**
     * 日期转换成字符串
     *
     * @param date 日期
     * @param patt 日期格式
     * @return String 字符串日期
     */
    public static String date2String(Date date, String patt) {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        String format = sdf.format(date);
        return format;
    }

    /**
     * 字符串转换成日期
     *
     * @param str  字符串日期
     * @param patt 日期格式
     * @return Date 日期
     * @throws ParseException
     */
    public static Date string2Date(String str, String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        Date parse = sdf.parse(str);
        return parse;
    }
}
