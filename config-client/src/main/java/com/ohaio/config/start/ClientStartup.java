package com.ohaio.config.start;

@SpringBootApplication

public class ClientStartup {
        public static void main(String[] args) {
            // 程序启动入口
            ConfigurableApplicationContext run = SpringApplication.run(ClientStartup.class, args);
        }

}

