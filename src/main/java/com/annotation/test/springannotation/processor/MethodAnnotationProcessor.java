package com.annotation.test.springannotation.processor;

import com.annotation.test.springannotation.annotation.MyTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * @author 张钟
 * @date 2018/2/2
 */
public class MethodAnnotationProcessor  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Method[] methods = ReflectionUtils.getAllDeclaredMethods(bean.getClass());
        if (methods != null) {
            for (Method method : methods) {
                MyTest myTest = AnnotationUtils.findAnnotation(method, MyTest.class);
                if(myTest!=null){
                    System.out.println(method.getName());
                }
                // process
            }
        }
        return bean;
    }
}
