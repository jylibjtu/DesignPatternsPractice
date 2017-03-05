package SimpleFactory;
import SimpleFactory.I.Shape;
/**
 * 
 * @author junyi
 * ��˵����ͼ�ι���������ģʽ��
 * ����ʱ�䣺2017-3-1 18:54:35
 */
public class ShapeFactory {
	private Shape s;//�践�ص�ʵ��s�ӿڶ���
	
	//����ģʽʵ��
	private static ShapeFactory instance = new ShapeFactory();
	private ShapeFactory(){}
	public static ShapeFactory getInstance(){
		return instance;
	}
	
	public Shape getShape(int shape){//���ݴ������ȷ������ͼ����״
		switch(shape){
		case Shape.CIRCLE:s = new Circle();break;
		case Shape.SQUARE:s = new Square();break;
		case Shape.RECTANGLE:s = new Rectangle();break;
		default:s = null;break;
		}
		return s;
	}
}
