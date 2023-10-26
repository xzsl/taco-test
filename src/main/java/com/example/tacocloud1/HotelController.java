package com.example.tacocloud1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Kakajaya
 * @Date: 2023/6/20-22:22
 */
@Controller
@ConfigurationProperties(prefix = "taco.order")
public class HotelController {
    public int pageSize = 20;
    @GetMapping("/")
    public String home() {
        System.out.println("miii"+pageSize);
        return "home";
    }
    //下面这个在用ConfigurationProperties的时候必须加上，否则不会生效
    //工作原理：https://blog.csdn.net/andy_zhang2007/article/details/86355259
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
