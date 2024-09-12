package com.ricka.princy.repository.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usage {

    public void main(String[] args) {
        Woman firstWoman = new Woman();
        Man man = new Man();
        this.executeSayHello(firstWoman);
        this.executeSayHello(man);
    }

    public void executeSayHello(Person sayHello){
        sayHello.sayHello("ricka");
    }
}
