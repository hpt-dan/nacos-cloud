package com.wanbo.nacos.provider.client;

import com.wanbo.nacos.provider.client.fallback.NacosProviderClientFallback;
import com.wanbo.nacos.provider.client.fallback.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = NacosProviderClientFallback.class,configuration = FeignConfiguration.class)
public interface NacosProviderClient {

    /**
     * 测试服务间调用
     * @param message
     * @return
     */
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable String message);
}
