package Builder;

import Builder.I.Item;
import Builder.I.Packing;

public abstract class ColdDrink implements Item {
	protected Packing packing = new Bottle();
	public abstract String name();

	public abstract Packing packing();

	public abstract float price();

}
