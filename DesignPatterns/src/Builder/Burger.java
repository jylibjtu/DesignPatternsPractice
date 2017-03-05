package Builder;

import Builder.I.Item;
import Builder.I.Packing;

public abstract class Burger implements Item {
	protected Packing packing = new Wrapper();
	public abstract String name();

	public abstract Packing packing();

	public abstract float price();

}
