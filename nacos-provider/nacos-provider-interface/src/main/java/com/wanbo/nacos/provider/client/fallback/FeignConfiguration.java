package com.wanbo.nacos.provider.client.fallback;

import org.springframework.context.annotation.Bean;

public class FeignConfiguration {
    @Bean
    public NacosProviderClientFallback echoServiceFallback() {
        return new NacosProviderClientFallback();
    }
}
