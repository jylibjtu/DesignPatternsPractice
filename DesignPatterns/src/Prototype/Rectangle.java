package Prototype;

import Prototype.I.Shape;


public class Rectangle extends Shape {

	private String type = "rectangle";
	
	public Rectangle(){
		this.setId((int)(Math.random() * 10000) + "");
	}
	
	@Override
	public void getType(){
		System.out.print(type);
	}
	
	@Override
	public Shape clone() {
		Rectangle r = new Rectangle();
		r.setId(this.getId());
		return r;
	}

}
