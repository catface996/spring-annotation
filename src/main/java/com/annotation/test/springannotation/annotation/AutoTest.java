package com.annotation.test.springannotation.annotation;
import java.lang.annotation.*;

/**
 * @author 张钟
 * @date 2018/2/2
 */

//元注解： 用来注解注解的
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoTest {
    long timeout() default Integer.MAX_VALUE;//设置超时时间的

    String name() default "";

    String version() default "v_0.0.1";

    String registry() default "registry";
}
