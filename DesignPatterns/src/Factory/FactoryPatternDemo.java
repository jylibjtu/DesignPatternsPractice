package Factory;
import Factory.I.*;
public class FactoryPatternDemo {
	public static void main(String []args){
		Shape s = null;
		ShapeFactory sf = new CircleFactory();//Բ����
		s = sf.getShape();
		s.draw();
		
		sf = new RectangleFactory();//���ι���
		s = sf.getShape();
		s.draw();
		
		sf = new SquareFactory();//���ι���
		s = sf.getShape();
		s.draw();
	}
}
