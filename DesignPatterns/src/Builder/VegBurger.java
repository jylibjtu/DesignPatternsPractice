package Builder;

import Builder.I.Packing;

public class VegBurger extends Burger {	
	public String name() {
		return "VegBurger";//Êß²Ë±¤
	}

	public Packing packing() {
		return packing;
	}

	public float price() {
		return 8.0f;
	}
}
