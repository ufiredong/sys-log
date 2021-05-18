package com.zxx.mgr;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ufiredong
 * @Title:
 * @Package
 * @Description:
 * @date 2021/5/1810:19
 */
@SpringBootApplication(scanBasePackages = {"com.zxx.*"})
@MapperScan({"com.zxx.core.mapper"})
@EnableScheduling
public class SysLogApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysLogApplication.class, args);
    }
}
