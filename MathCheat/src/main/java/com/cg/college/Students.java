package com.cg.college;

public class Students {
	
	//MathCheat m=new MathCheat();
	
	private MathCheat chit;

	public MathCheat getChit() {
		return chit;
	}

	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	void cheating() {
		chit.mathCheat();
	}
}
