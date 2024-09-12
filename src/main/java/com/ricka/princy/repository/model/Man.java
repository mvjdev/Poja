package com.ricka.princy.repository.model;

public class Man implements Person {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, I'a man " + name);
    }
}
