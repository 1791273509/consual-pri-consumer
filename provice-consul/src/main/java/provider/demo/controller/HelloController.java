package provider.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wenbaoxie
 * @Date 2020/9/15
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "helle consul 我是服务提供者";
    }
}
