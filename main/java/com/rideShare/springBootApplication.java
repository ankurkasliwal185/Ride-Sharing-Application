package com.rideShare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication()
@EnableAsync
@Configuration
@EnableConfigurationProperties
//@EnableJpaRepositories(basePackages = {"com.rideShare.*"},
//        entityManagerFactoryRef = "entityManagerFactory",
//        enableDefaultTransactions = false)
public class springBootApplication {

    public static void main(String[] args){
        SpringApplication.run(springBootApplication.class, args);
}
}
