package AbstractFactory;

import AbstractFactory.I.AbstractFactory;
import AbstractFactory.I.Color;
import AbstractFactory.I.Shape;

public class ShapeFactory extends AbstractFactory {

	public Shape getShape(int shape) {
		Shape s = null;
		switch(shape){
		case Shape.CIRCLE: s = new Circle();break;
		case Shape.RECTANGLE: s = new Rectangle();break;
		case Shape.SQUARE: s = new Square();break;
		}
		// TODO Auto-generated method stub
		return s;
	}

	public Color getColor(int shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
