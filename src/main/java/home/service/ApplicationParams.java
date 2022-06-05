package home.service;

import javax.inject.Singleton;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Singleton
public class ApplicationParams {
    @ConfigProperty(name = "parametro.teste", defaultValue = "")
    String param;

    public String getParam() {
        return param;
    }
}
