package com.annotation.test.springannotation.component;

import org.springframework.stereotype.Component;

import com.annotation.test.springannotation.annotation.AutoTest;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@Component
public class MyComponent2 {

    @AutoTest
    protected void sayHello2() {

    }
}
