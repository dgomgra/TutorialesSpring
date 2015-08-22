package com.edu4java.spring.tutorial5;

import java.util.Date;

public class FooterForSign {
	
	String name;
	String place;
	
	public FooterForSign(){
		
	}
	
	public FooterForSign(String name, String place){
		this.name = name;
		this.place = place;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	public String getFooterForSign(){
		Date today = new Date();
		return name + " - " + today.toString() + " - " + place;
	}


}
