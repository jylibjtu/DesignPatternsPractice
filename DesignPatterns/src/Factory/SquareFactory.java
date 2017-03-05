package Factory;

import Factory.I.*;

public class SquareFactory implements ShapeFactory {
	public Shape getShape(){
		return new Square();
	}
}
