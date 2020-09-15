package consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author wenbaoxie
 * @Date 2020/9/15
 */
@RestController
public class ServiceController {
    @Autowired
    private RestTemplate restTemplate;

    public final String URL = "http://provider-local";


    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String discover1() {
        return restTemplate.getForObject(URL + "/hello",String.class);
    }

    //获取所有服务
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("provider");
    }
    //从所有服务中选择一个服务（轮询）
    @RequestMapping("/ddd")
    public Object discover() {
        return loadBalancer.choose("provider-local").getUri().toString();
    }


}
