package com.yhr.microservice.microservicemanager.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by YHR on 2018/3/25.
 */

@Component
public class BasicTemplate<T> {

    @Autowired
    public RestTemplate restTemplate;

    public List<T> getDataForList(){
        return null;
        //return restTemplate.getForObject()
    }


}
