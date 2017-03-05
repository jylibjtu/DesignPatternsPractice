package Builder;

import Builder.I.Packing;

public class ChickenBurger extends Burger {
	public String name() {
		return "ChickenBurger";//º¶»‚±§
	}

	public Packing packing() {
		return packing;
	}

	public float price() {
		return 10.0f;
	}

}
