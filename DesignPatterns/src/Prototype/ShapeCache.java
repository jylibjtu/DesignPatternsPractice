package Prototype;
import java.util.HashMap;
import java.util.Iterator;
import Prototype.I.Shape;
import java.util.Map;
public class ShapeCache {
	private HashMap<String,Shape> shapeMap = new HashMap<String,Shape>();
	public Shape getShape(String id){
		return shapeMap.get(id);
	}
	public void loadCache(HashMap<String,Shape> map){
		Iterator<Map.Entry<String,Shape>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, Shape> entry = (HashMap.Entry<String, Shape>)iter.next();
			String key = entry.getKey();
			Shape s = map.get(key);
			shapeMap.put((String)key,s.clone());
		}
	}
	public void showCache(){
		Iterator<Map.Entry<String,Shape>> iter = shapeMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, Shape> entry = (Map.Entry<String, Shape>)iter.next();
			String key = entry.getKey();
			Shape s = shapeMap.get(key);
			System.out.print(s.toString() + " -- ");
			s.getType();
			System.out.println(" -- " + s.getId());
		}
	}
}
