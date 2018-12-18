package com.ohaio.config.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class ClientStartup {
        public static void main(String[] args) {
            // 程序启动入口
            ConfigurableApplicationContext run = SpringApplication.run(ClientStartup.class, args);
        }

}

