package cn.bcolor.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类
 *
 * @author wangzhaohui 2017/10/12.
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@ConfigurationProperties("hello")
public class Launcher {


    private String key;

    @Value("${hello.key}")
    private String value;

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "hello " + key + "&" + value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
