package AbstractFactory;
import AbstractFactory.I.*;
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		FactoryProducer fp = FactoryProducer.getInstance();
		
		AbstractFactory af = fp.getFactory(FactoryProducer.TYPE_SHAPE);//����ͼ�ι���
		Shape s = af.getShape(Shape.RECTANGLE);//���ɾ���
		s.draw();//����
		
		af = fp.getFactory(FactoryProducer.TYPE_COLOR);//������ɫ����
		Color c = af.getColor(Color.BLUE);//������ɫ
		c.fill();//���
		
	}

}
