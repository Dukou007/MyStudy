package com.study.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @description:配置类
 * @author:zhou_xiaolong@hoperun.com
 * @date:2019/8/16 9:55
 */
@Configuration
@ComponentScan(basePackages = "com.study")
@Component
public class configuration {
}
