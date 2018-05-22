package com.pjmike.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.pjmike.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author pjmike
 * @create 2018-05-01 17:43
 */
@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String msg) {
        return "hello world";
    }
}
