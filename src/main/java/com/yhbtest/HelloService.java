package com.yhbtest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanghongbo on 2018/4/6.
 */
@FeignClient("hello-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
}
