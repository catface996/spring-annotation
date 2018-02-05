package com.annotation.test.springannotation.processor;

import java.lang.reflect.Method;
import java.util.Map;

import com.annotation.test.springannotation.config.TestCaseMappingConfig;
import com.annotation.test.springannotation.config.TestCaseVO;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.annotation.test.springannotation.annotation.AutoTest;

/**
 * @author 张钟
 * @date 2018/2/2
 */
public class MethodAnnotationProcessor implements BeanPostProcessor {

    private Map<String,TestCaseVO> caseVOMap;

    public MethodAnnotationProcessor(Map<String,TestCaseVO> caseVOMap){
        this.caseVOMap = caseVOMap;
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        Method[] methods = ReflectionUtils.getAllDeclaredMethods(bean.getClass());
        if (methods != null) {
            for (Method method : methods) {
                AutoTest autoTest = AnnotationUtils.findAnnotation(method, AutoTest.class);
                RequestMapping requestMapping = AnnotationUtils.findAnnotation(method,
                    RequestMapping.class);
                if (autoTest != null && requestMapping!=null) {
                    System.out.println(method.getName());
                    System.out.println(autoTest.name());
                    System.out.println(requestMapping.value()[0]);
                    TestCaseVO testCaseVO = new TestCaseVO();
                    testCaseVO.setName(autoTest.name());
                    testCaseVO.setUrl(requestMapping.value()[0]);
                    caseVOMap.put(autoTest.name(),testCaseVO);
                }
                // process
            }
        }
        return bean;
    }
}
