package com.prowings.languageBasics.constructor;

public class Properties {

	int ssd;
	int ram;
	int memory;

	public Properties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Properties(int ssd, int ram, int memory) {
		super();
		this.ssd = ssd;
		this.ram = ram;
		this.memory = memory;
	}	@Override
	public String toString() {
		return "Properties [ssd=" + ssd + ", ram=" + ram + ", memory=" + memory + "]";
	}

}
