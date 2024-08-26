package com.afhunt.authservice.config;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayDiscoveryConfiguration {

    // configuration static
    /*@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("example_route", r -> r.path("/admin-service/**")
                        .uri("http://localhost:8083"))
                .build();
    }*/

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("service1_route", r -> r.path("/admin-service/**")
                .uri("lb://admin-service"))
                .build();
    }

}
