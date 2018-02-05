package com.annotation.test.springannotation.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.test.springannotation.processor.ClassAnnotationProcessor;
import com.annotation.test.springannotation.processor.MethodAnnotationProcessor;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@Configuration
public class MyConfiguration {

    @Autowired
    private Map<String, TestCaseVO> testCaseVOMap;

    @Bean
    public BeanPostProcessor getClassAnnotationProcessor() {
        return new ClassAnnotationProcessor();
    }

    @Bean
    public BeanPostProcessor getMethodAnnotationProcessor() {
        return new MethodAnnotationProcessor(testCaseVOMap);
    }
}
