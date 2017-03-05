package AbstractFactory;

import AbstractFactory.I.AbstractFactory;
import AbstractFactory.I.Color;
import AbstractFactory.I.Shape;

public class ColorFactory extends AbstractFactory {
	public Shape getShape(int shape) {
		// TODO Auto-generated method stub
		return null;
	}
	public Color getColor(int color) {
		// TODO Auto-generated method stub
		Color c = null;
		switch(color){
		case Color.BLUE: c = new Blue();break;
		case Color.GREEN: c = new Green();break;
		case Color.RED: c = new Red();break;
		}
		return c;
	}

}
