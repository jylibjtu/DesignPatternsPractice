package Factory;
import Factory.I.*;
public class CircleFactory implements ShapeFactory {
	public Shape getShape(){
		return new Circle();
	}
}
