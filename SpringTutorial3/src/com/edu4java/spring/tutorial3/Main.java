package com.edu4java.spring.tutorial3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		Hello hello = (Hello) ctx.getBean("hola");
		hello.decirHola();

	}

}
