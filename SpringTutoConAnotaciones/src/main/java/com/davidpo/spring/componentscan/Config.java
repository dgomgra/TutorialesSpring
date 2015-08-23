package com.davidpo.spring.componentscan;

import javax.inject.Inject;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/config.properties")
public class Config {
    @Inject
    private Environment environment;

    @Bean
    public String nombre(){
    	String valor = environment.getProperty("dato.nombre");
    	return valor;
    }
    

}
