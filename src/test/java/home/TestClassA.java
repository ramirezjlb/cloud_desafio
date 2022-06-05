package home;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import home.service.ClassA;
import home.service.ClassB;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectSpy;


@QuarkusTest
public class TestClassA {
    @InjectSpy ClassA classA;
    @InjectSpy ClassB classB;

    @Test
    void teste1() {
        try {
            // when(classB.hello()).thenReturn("teste");
            when(classB.hello()).thenThrow(new Exception("teste throw exception"));
        } catch (Exception e) {
            e.printStackTrace();
            fail("Falha no mock do teste1");
        }

        assertEquals("Hello from A!",classA.helloA(), "Falha no teste1 etapa 1");
        var erro = assertThrows(Exception.class, ()->{
            classA.hello();
        }, "Falha no teste1 etapa 2");
        assertEquals("teste throw exception", erro.getMessage(), "Falha no teste1 etapa2!");
        assertEquals("Hello World!",classB.helloWorld(), "Falha no teste1 etapa 3");

        verify(classA, times(1)).helloA();
        // assertEquals("teste",classB.hello(), "Falha no teste1 etapa 1");
    }

    @Test
    void teste2() {
        assertEquals("John", classA.getMessage(), "Falha no teste2");
    }
}
