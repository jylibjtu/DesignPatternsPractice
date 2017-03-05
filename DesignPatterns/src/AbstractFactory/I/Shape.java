package AbstractFactory.I;

public interface Shape {
	public static final int CIRCLE = 1;//表示圆
	public static final int SQUARE = 2;//表示方形
	public static final int RECTANGLE = 3;//表示矩形
	public void draw();
}
