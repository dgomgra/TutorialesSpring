package com.davidpo.spring.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.davidpo.spring.componentscan.DecirNombre;


public class Main {

	public static void main(String[] args) throws Throwable{
        String pkgName = Config.class.getPackage().getName();
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(pkgName);
		
		IF_DecirNombre nombrar = ac.getBean(DecirNombre.class);
		
		System.out.println("1: " + nombrar.getNombre());
		System.out.println("2: " + nombrar.getNombreDos());
		System.out.println("3: " + nombrar.getNombreTres());

	}
	


}
