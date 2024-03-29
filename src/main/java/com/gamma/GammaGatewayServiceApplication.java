package com.gamma;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.handler.RoutePredicateHandlerMapping;
import org.springframework.cloud.gateway.route.RouteDefinitionRouteLocator;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Log4j2
@EnableEurekaClient
@SpringBootApplication
public class GammaGatewayServiceApplication {

    public static void main(String[] args) {
//        RouteDefinitionRouteLocator
//        RoutePredicateHandlerMapping
        SpringApplication.run(GammaGatewayServiceApplication.class, args);
    }
}
