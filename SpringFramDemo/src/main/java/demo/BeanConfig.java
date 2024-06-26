package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.print.Doc;

@Configuration
@ComponentScan(basePackages = "demo")

public class BeanConfig {
    @Bean
    public Doctor doctor() {
        return new Doctor();
    }
}
