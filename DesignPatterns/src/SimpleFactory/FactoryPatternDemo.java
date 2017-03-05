package SimpleFactory;
import SimpleFactory.I.*;
public class FactoryPatternDemo {
	public static void main(String []args){
		ShapeFactory sf = ShapeFactory.getInstance();
		Shape s = sf.getShape(Shape.CIRCLE);
		s.draw();
		s = sf.getShape(Shape.RECTANGLE);
		s.draw();
		s = sf.getShape(Shape.SQUARE);
		s.draw();
	}
}
