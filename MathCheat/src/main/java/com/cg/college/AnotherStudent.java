package com.cg.college;

public class AnotherStudent {
	private MathCheat chit;

	public MathCheat getChit() {
		return chit;
	}

	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	public void startCheating() {
		chit.mathCheat();
	}
}
