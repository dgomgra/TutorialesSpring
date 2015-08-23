package com.davidpo.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {

        String path = packageToFolders(Main.class) + "/context.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        IF_DecirNombre nombrar = applicationContext.getBean(DecirNombre.class);
        assert null != nombrar : "the customerService reference can't be null!";
        
        System.out.println("El nombre es: " + nombrar.getNombre());

	}
	
    private static String packageToFolders(Class<?> clazzWhosePackageWeWant) {
        Package aPackage = clazzWhosePackageWeWant.getPackage();
        String packageName = aPackage.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');

        for (char c : packageName.toCharArray())
            stringBuilder.append(c == '.' ? '/' : c);

        return stringBuilder.toString().trim();
    }

}
