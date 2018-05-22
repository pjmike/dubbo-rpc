package com.pjmike.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pjmike.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author pjmike
 * @create 2018-05-01 17:47
 */
@Component
public class DemoConsumer {
    @Reference()
    private DemoService demoService;

    public void hello() {
        System.out.println(demoService.sayHello("hi"));
    }
}
