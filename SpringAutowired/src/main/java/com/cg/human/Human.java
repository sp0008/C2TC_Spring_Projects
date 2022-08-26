package com.cg.human;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	private Heart heart;
	
	public Human() {
		System.out.println("Human constructor is called");
	}
	
	/*
	 * public Heart getHeart() { return heart; }
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */
	
	public Heart getHeart() {
		return heart;
	}

	@Qualifier("humanHeart")
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		System.out.println("The name of the animal:"+heart.getAnimal());
		System.out.println("The number of hearts:"+heart.getHeartNumber());
		heart.pumping();		
	}
}
