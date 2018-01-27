package com.atuldwivedi.learn.spring.javaclass;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.atuldwivedi.learn.spring.javaclass")
@PropertySource("classpath:car.properties")
public class MyConfig {

}
