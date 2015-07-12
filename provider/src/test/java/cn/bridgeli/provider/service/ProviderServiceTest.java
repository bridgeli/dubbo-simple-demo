package cn.bridgeli.provider.service;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationProvider.xml")
public class ProviderServiceTest {

    private static final Logger LOG = LoggerFactory.getLogger(ProviderServiceTest.class);

    @Test
    public void testYield() {

        LOG.info("Press any key to exit.");

        try {
            System.in.read();
        } catch (IOException e) {
            LOG.error("error", e);
        }
    }
}
