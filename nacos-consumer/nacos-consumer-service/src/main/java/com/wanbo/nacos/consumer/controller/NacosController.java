package com.wanbo.nacos.consumer.controller;

import com.wanbo.nacos.provider.client.NacosProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosController {

    @Autowired
    private NacosProviderClient nacosProviderClient;


    @GetMapping(value = "/hello/{message}")
    public String echo(@PathVariable String message) {
        return nacosProviderClient.echo(message);
    }

}
