package com.meng.orderservicefeignhystrix.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class OrderServiceFallback implements OrderService{
    public String getProduct(String productId){
        return "order-service-feign-hystrix::success";
    };
}
