package cn.bcolor.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 * @author wangzhaohui 2017/10/12.
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
