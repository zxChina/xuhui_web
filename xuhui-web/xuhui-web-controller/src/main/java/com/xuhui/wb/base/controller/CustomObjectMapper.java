package com.xuhui.wb.base.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * 自定义的JSON转换MAPPER转换器
 *
 * @author xstarfct
 * @version 2018/7/13 下午2:17
 */
@Component("customObjectMapper")
public class CustomObjectMapper extends ObjectMapper {

    private static final long serialVersionUID = 6293644851962678998L;

    public CustomObjectMapper() {
        super();
        //设置日期转换yyyy-MM-dd HH:mm:ss
        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //忽略未知的字段 否则会UnrecognizedPropertyException
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
