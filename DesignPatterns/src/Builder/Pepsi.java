package Builder;

import Builder.I.Packing;

public class Pepsi extends ColdDrink {
	public String name() {
		return "Pepsi";//���¿���
	}

	public Packing packing() {
		return packing;
	}

	public float price() {
		return 3.0f;
	}

}
