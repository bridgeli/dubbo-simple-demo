package cn.bridgeli.consumer.service;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationConsumer.xml")
public class ConsumerServiceTest {

    @Resource
    private ConsumerService consumerService;

    @Test
    public void testConsume() {
        String str = "Denny";
        String consume = consumerService.consume(str);
        String result = "Hello:" + str;
        Assert.assertTrue(result.equals(consume));
    }
}
