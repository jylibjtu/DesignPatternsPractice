package Builder;

import Builder.I.Packing;

public class Coke extends ColdDrink {
	public String name() {
		return "Coke";//�ɿڿ���
	}

	public Packing packing() {
		return packing;
	}

	public float price() {
		return 2.5f;
	}

}
