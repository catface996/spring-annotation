package com.annotation.test.springannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张钟
 * @date 2018/2/5
 */
@Configuration
public class TestCaseMappingConfig {

    @Bean
    Map<String,TestCaseVO> getCaseMapping(){
        return new HashMap<>();
    }


}
