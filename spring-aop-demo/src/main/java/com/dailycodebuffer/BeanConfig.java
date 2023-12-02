package com.dailycodebuffer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.dailycodebuffer")
@EnableAspectJAutoProxy
public class BeanConfig {

}
