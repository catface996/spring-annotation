package com.annotation.test.springannotation.config;

import com.annotation.test.springannotation.processor.ClassAnnotationProcessor;
import com.annotation.test.springannotation.processor.MethodAnnotationProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@Configuration
public class MyConfiguration {

    @Bean
    public BeanPostProcessor getClassAnnotationProcessor(){
        return new ClassAnnotationProcessor();
    }

    @Bean
    public BeanPostProcessor getMethodAnnotationProcessor(){
        return new MethodAnnotationProcessor();
    }
}
