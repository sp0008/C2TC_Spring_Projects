package com.cg.mobile;

public class Airtel implements Sim{
	
	Airtel(){
		System.out.println("Airtel constructor is called");
	}

	public void calling() {
		System.out.println("Calling from Airtel");
	}
	
	public void data() {
		System.out.println("Airtel provides huge data");	
	}
}
