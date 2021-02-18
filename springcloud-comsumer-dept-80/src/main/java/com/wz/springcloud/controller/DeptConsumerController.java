package com.wz.springcloud.controller;

import com.wz.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class DeptConsumerController {

    //消费者：没有service层

    //RestTemplate 。。。。 供我们调用 注册到 spring中

    @Autowired
    private RestTemplate restTemplate;//提供多种远程便捷访问http服务的方法

    //用 Ribbon 不能写死 需要通过服务访问
    //private static final  String REST_URL_PREFIX = "http://localhost:8001";
    private static final  String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";


    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"dept/add",dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get"+id,Dept.class );
    }


    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

}
