package com.cg.human;

public class Heart {
	
	private String animal; 
	private int heartNumber;
	
	//Create two variables animal and no of hearts
	//inject value to variable using property tag
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getHeartNumber() {
		return heartNumber;
	}

	public void setHeartNumber(int heartNumber) {
		this.heartNumber = heartNumber;
	}

	void pumping() {
		System.out.println("The heart is pumping blood");
	}
}
