package com.davidpo.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) throws Throwable {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(ConfiguracionDeAplicacion.class);
        
        IF_DecirNombre nombrar = 
        		ctx.getBean(DecirNombre.class);
        assert null != nombrar : "the customerService reference can't be null!";
        
        System.out.println("El nombre es: " + nombrar.getNombre());
        
        
    }
}
