package Prototype;

import Prototype.I.Shape;
public class Circle extends Shape {

	private String type = "circle";
	
	public Circle(){
		this.setId((int)(Math.random() * 10000) + "");
	}
	
	@Override
	public void getType(){
		System.out.print(type);
	}
	
	@Override
	public Shape clone() {
		Circle c = new Circle();
		c.setId(this.getId());
		return c;
	}

}
