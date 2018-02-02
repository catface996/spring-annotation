package com.annotation.test.springannotation.annotation;

import java.lang.annotation.*;

/**
 * @author 张钟
 * @date 2018/2/2
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface JewelService {

    String name() default "";

    String version() default "v_0.0.1";

    String registry() default "registry";

}
