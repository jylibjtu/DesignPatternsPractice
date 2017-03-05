package Prototype;
import java.util.HashMap;
import Prototype.I.Shape;
public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache sc = new ShapeCache();
		HashMap<String,Shape> cache = new HashMap<String,Shape>();
		Shape s = null;
		
		s = new Circle();
		cache.put(s.getId(), s);
		System.out.println(s + "*****" + s.getId());
		
		s = new Rectangle();
		cache.put(s.getId(), s);
		System.out.println(s + "*****" + s.getId());
		
		s = new Square();
		cache.put(s.getId(), s);
		System.out.println(s + "*****" + s.getId());
		
		sc.loadCache(cache);
		sc.showCache();
	}

}
