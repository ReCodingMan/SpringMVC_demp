package com.cc.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换成日期
 */
public class StringtoDateConverter implements Converter<String, Date> {

    /**
     * 传入进来的字符串
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        if (s == null) {
            throw new RuntimeException("请您传入数据");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //把字符串转换日期
        try {
            return df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("数据类型转换有误");
        }
    }
}
