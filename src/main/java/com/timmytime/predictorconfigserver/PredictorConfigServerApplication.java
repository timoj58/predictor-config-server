package com.timmytime.predictorconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PredictorConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredictorConfigServerApplication.class, args);


    }

}
