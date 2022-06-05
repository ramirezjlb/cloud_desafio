package home.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class ClassA {
    private ClassB classB;
    private String message;

    @Inject ApplicationParams appParams;

    ClassA(ClassB classB) {
        this.classB = classB;
        // this.message = appParams.get().teste();
    }

    // @PostConstruct
    void init(@Observes StartupEvent start) {
        this.message = appParams.getParam();
    }

    public String hello() throws Exception {
        return classB.hello();
    }

    public String helloA() {
        return "Hello from A!";
    }

    public String getMessage() {
        return message;
    }
}
