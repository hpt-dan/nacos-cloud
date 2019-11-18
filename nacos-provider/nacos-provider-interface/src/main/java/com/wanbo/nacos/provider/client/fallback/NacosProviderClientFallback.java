package com.wanbo.nacos.provider.client.fallback;

import com.wanbo.nacos.provider.client.NacosProviderClient;
import org.springframework.stereotype.Component;

@Component
public class NacosProviderClientFallback implements NacosProviderClient {

    @Override
    public String echo(String message) {
        return "请求失败，请检查你网络";
    }
}
