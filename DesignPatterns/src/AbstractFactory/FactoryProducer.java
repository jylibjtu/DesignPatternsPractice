package AbstractFactory;

import AbstractFactory.I.AbstractFactory;

public class FactoryProducer {
	public static final int TYPE_COLOR = 1001;
	public static final int TYPE_SHAPE = 1002;
	
	private static FactoryProducer instance = new FactoryProducer();
	private FactoryProducer(){}
	
	public static FactoryProducer getInstance(){
		return instance;
	}
	public AbstractFactory getFactory(int type){
		AbstractFactory af = null;
		switch(type){
		case FactoryProducer.TYPE_COLOR: af = new ColorFactory();break;
		case FactoryProducer.TYPE_SHAPE: af = new ShapeFactory();break;
		}
		return af;
	}
}
