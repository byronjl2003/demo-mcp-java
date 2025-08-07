package com.example.demomcpjava;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticTools {

    public record Request(double a, double b) {
    }

    public record Response(double result) {
    }

    public Response add(Request request) {
        return new Response(request.a() + request.b());
    }

    public Response multiply(Request request) {
        return new Response(request.a() * request.b());
    }
}
