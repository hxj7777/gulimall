package com.atguigu.gulimall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 1、配置文件中
 * mybatis-plus:
 *   mapper-locations: classpath:/mapper/pms/*.xml
 *
 * 2、使用@MapperScan扫描所有mapper接口
 *
 */
@EnableSwagger2
@MapperScan(basePackages = "com.atguigu.gulimall.oms.dao")
@SpringBootApplication
public class GulimallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallOmsApplication.class, args);
    }

}
