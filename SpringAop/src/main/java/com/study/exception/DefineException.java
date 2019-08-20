package com.study.exception;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:自定义异常处理类
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/20 10:36
 */
@RestControllerAdvice
public class DefineException {
    private static Logger logger = LoggerFactory.getLogger(DefineException.class);

    @ExceptionHandler(ReException.class)
    public String FindException(ReException e) {
        JSONObject result = new JSONObject();
        result.put("message",e.getMessage());
        result.put("statusCode",e.getStatusCode());
        return String.valueOf(result);
    }


}
