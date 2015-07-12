package cn.bridgeli.provider.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.bridgeli.provider.service.ProviderService;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderServiceImpl.class);

    @Override
    public String yield(String data) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            LOG.error("error", e);
        }
        return "Hello:" + data;
    }
}
