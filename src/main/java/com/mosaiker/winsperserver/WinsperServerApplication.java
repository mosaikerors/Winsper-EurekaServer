package com.mosaiker.winsperserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WinsperServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(WinsperServerApplication.class, args);
  }

}









