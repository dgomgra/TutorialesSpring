package com.edu4java.spring.tutorial3;

public class Hello {
	private String nombre;

	public void setName(String name) {
		this.nombre = name;
	}

	public void decirHola(){
		System.out.println("Hola como estas " + nombre);
		
		System.out.println("Otro cambio");
	}
}
