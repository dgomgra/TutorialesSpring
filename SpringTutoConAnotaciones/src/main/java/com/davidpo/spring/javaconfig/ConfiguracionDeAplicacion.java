package com.davidpo.spring.javaconfig;

import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/config.properties")
public class ConfiguracionDeAplicacion {
	@Bean
	public IF_DecirNombre nombrar(Environment environment){
		String nombre = environment.getProperty("dato.nombre");
		DecirNombre prueba = new DecirNombre();
		prueba.setNombre(nombre);
		return prueba;
	}
}
