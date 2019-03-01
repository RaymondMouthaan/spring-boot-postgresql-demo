package org.mouthaan.springboot.postgresql.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootPostgresqlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPostgresqlDemoApplication.class, args);
    }

}
