package consumer.controller;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wenbaoxie
 * @Date 2020/8/9
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();//定义为随机
    }
}