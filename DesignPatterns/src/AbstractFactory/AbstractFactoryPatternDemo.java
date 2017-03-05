package AbstractFactory;
import AbstractFactory.I.*;
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		FactoryProducer fp = FactoryProducer.getInstance();
		
		AbstractFactory af = fp.getFactory(FactoryProducer.TYPE_SHAPE);//生成图形工厂
		Shape s = af.getShape(Shape.RECTANGLE);//生成矩形
		s.draw();//画出
		
		af = fp.getFactory(FactoryProducer.TYPE_COLOR);//生成颜色工厂
		Color c = af.getColor(Color.BLUE);//生成蓝色
		c.fill();//填充
		
	}

}
