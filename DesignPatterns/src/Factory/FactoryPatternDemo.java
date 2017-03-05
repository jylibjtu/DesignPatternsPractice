package Factory;
import Factory.I.*;
public class FactoryPatternDemo {
	public static void main(String []args){
		Shape s = null;
		ShapeFactory sf = new CircleFactory();//圆工厂
		s = sf.getShape();
		s.draw();
		
		sf = new RectangleFactory();//矩形工厂
		s = sf.getShape();
		s.draw();
		
		sf = new SquareFactory();//方形工厂
		s = sf.getShape();
		s.draw();
	}
}
