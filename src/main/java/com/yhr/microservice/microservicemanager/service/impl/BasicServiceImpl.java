package com.yhr.microservice.microservicemanager.service.impl;

import com.yhr.microservice.microservicemanager.service.BasicService;
import com.yhr.microservice.microservicemanager.vo.PlatformEnv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by YHR on 2018/3/28.
 */
public class BasicServiceImpl implements BasicService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public PlatformEnv getSystemInfo() {
        String result = restTemplate.getForObject("http://eureka-client/env", String.class);

        return null;
    }
}
