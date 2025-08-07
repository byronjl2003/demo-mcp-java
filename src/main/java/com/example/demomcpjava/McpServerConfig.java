package com.example.demomcpjava;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class McpServerConfig {

    @Bean
    @Description("Adds two numbers")
    public Function<ArithmeticTools.Request, ArithmeticTools.Response> add(ArithmeticTools tools) {
        return tools::add;
    }

    @Bean
    @Description("Multiplies two numbers")
    public Function<ArithmeticTools.Request, ArithmeticTools.Response> multiply(ArithmeticTools tools) {
        return tools::multiply;
    }
}
