package com.davidpo.spring.xml;

public class DecirNombre implements IF_DecirNombre {
	private String nombre;

	/* (non-Javadoc)
	 * @see com.davidpo.spring.xml.IF_DecirNombre#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
