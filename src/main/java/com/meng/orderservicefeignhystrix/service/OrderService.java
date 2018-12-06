package com.meng.orderservicefeignhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "product-service",fallback = OrderServiceFallback.class)
public interface OrderService {
    @RequestMapping(method = RequestMethod.GET,value = "/product/getProduct")
    String getProduct(@RequestParam("id") String productId);
}
