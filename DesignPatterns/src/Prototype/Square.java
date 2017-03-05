package Prototype;

import Prototype.I.Shape;

public class Square extends Shape {

	private String type = "square";
	
	public Square(){
		super();
		super.setId((int)(Math.random() * 10000) + "");
	}
	
	@Override
	public void getType(){
		System.out.print(type);
	}
	
	@Override
	public Shape clone() {
		Square s = new Square();
		s.setId(this.getId());
		return s;
	}
	
	/*
	@Test
	public void test(){
		Square s = new Square();
		s.getType();
	}
	*/
	public static void main(String []args){
		Square s = new Square();
		s.getType();
		System.out.println(s.getId());
		System.out.println(((Square)s.clone()).getId());
	}
	
}
