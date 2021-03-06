package com.ql;

import com.ql.config.RedisProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by 东东 on 2018/10/28.
 */
@SpringBootApplication
@EnableConfigurationProperties(RedisProperties.class)
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RunApplication.class);
        springApplication.run(args);
    }

}
