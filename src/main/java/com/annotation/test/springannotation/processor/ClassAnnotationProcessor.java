package com.annotation.test.springannotation.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;

import com.annotation.test.springannotation.annotation.AutoTest;

/**
 * @author 张钟
 * @date 2018/2/2
 */
public class ClassAnnotationProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {

        AutoTest autoTest = AnnotationUtils.findAnnotation(bean.getClass(), AutoTest.class);
        if (autoTest != null) {
            System.out.println(bean.getClass().getName());
        }

        return bean;
    }
}
