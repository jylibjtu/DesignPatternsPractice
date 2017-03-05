package Factory;
import Factory.I.*;
public class RectangleFactory implements ShapeFactory{
	public Shape getShape(){
		return new Rectangle();
	}
}
