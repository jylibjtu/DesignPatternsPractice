package SimpleFactory;
import SimpleFactory.I.Shape;
/**
 * 
 * @author junyi
 * 类说明：图形工厂，工厂模式类
 * 创建时间：2017-3-1 18:54:35
 */
public class ShapeFactory {
	private Shape s;//需返回的实现s接口对象
	
	//单例模式实现
	private static ShapeFactory instance = new ShapeFactory();
	private ShapeFactory(){}
	public static ShapeFactory getInstance(){
		return instance;
	}
	
	public Shape getShape(int shape){//根据传入参数确定返回图形形状
		switch(shape){
		case Shape.CIRCLE:s = new Circle();break;
		case Shape.SQUARE:s = new Square();break;
		case Shape.RECTANGLE:s = new Rectangle();break;
		default:s = null;break;
		}
		return s;
	}
}
