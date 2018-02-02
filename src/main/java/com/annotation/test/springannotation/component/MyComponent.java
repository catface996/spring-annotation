package com.annotation.test.springannotation.component;

import com.annotation.test.springannotation.annotation.JewelRemote;
import com.annotation.test.springannotation.annotation.MyTest;
import org.springframework.stereotype.Component;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@Component
@JewelRemote( name ="haha1")
public class MyComponent {

    @MyTest
    protected void sayHello1(){

    }
}
