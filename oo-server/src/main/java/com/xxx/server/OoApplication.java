package com.xxx.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/** 启动类
 * @author xinfan  @create 2023/1/13-下午12:29
 */
@SpringBootApplication
@EnableScheduling // 开启定时任务
public class OoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OoApplication.class, args);
    }

}