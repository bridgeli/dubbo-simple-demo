package cn.bridgeli.consumer.service.impl;

import org.springframework.stereotype.Service;

import cn.bridgeli.consumer.service.ConsumerService;
import cn.bridgeli.provider.service.ProviderService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private ProviderService providerService;

    @Override
    public String consume(String str) {

        String hello = providerService.yield(str);
        return hello;

    }

}
