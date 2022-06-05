package home.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClassB {
    public String hello() throws Exception {
        return "Hello from ClassB!";
    }

    public String helloWorld() {
        return "Hello World!";
    }
}