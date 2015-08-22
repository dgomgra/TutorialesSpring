package com.edu4java.spring.tutorial5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/edu4java/spring/tutorial5/contexto.xml");
		FooterForSign footerForSign = (FooterForSign) ctx.getBean("footerForSign");
		
		System.out.println(footerForSign.getFooterForSign());
		
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext(
				"com/edu4java/spring/tutorial5/contexto2.xml");
		FooterForSign footerForSign2 = (FooterForSign) ctx2.getBean("footerForSign");
		
		System.out.println(footerForSign2.getFooterForSign());
		
	}
}