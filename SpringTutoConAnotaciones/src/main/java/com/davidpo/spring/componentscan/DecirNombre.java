package com.davidpo.spring.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecirNombre implements IF_DecirNombre {
	/* DISTINTAS FORMAS DE INYECTAR */
	
	@Autowired /* Anotación de Spring*/
	private String nombre;
	
	@Inject /* Anotación de Oracle*/
	private String nombre_dos;
	
	@Resource /* Anotación de Oracle obsoleta*/
	private String nombre_tres;

	/* (non-Javadoc)
	 * @see com.davidpo.spring.componentscan.IF_DecirNombre#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}
	
	/* (non-Javadoc)
	 * @see com.davidpo.spring.componentscan.IF_DecirNombre#getNombreDos()
	 */
	@Override
	public String getNombreDos() {
		return nombre_dos;
	}

	/* (non-Javadoc)
	 * @see com.davidpo.spring.componentscan.IF_DecirNombre#getNombreTres()
	 */
	@Override
	public String getNombreTres() {
		return nombre_tres;
	}

	
    @PostConstruct
    public void analyse() throws Throwable {
    	System.out.println("Nombre uno: " + nombre);
    	System.out.println("Nombre dos: " + nombre_dos);
    	System.out.println("Nombre tres: " + nombre_tres);
    }
}
