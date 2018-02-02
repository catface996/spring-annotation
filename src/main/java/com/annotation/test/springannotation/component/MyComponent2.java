package com.annotation.test.springannotation.component;

import com.annotation.test.springannotation.annotation.MyTest;
import org.springframework.stereotype.Component;

import com.annotation.test.springannotation.annotation.JewelRemote;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@Component
@JewelRemote( name ="haha2")
public class MyComponent2 {

    @MyTest
    protected void sayHello2(){

    }
}
