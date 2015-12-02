package com.curso.maven.basico;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(App.class);
        System.out.println(ctx.getBean(App.class).saludar("Juan"));
    }
    
    public String saludar(String nombre) {
    	return "Hola " + nombre;
    }
}
