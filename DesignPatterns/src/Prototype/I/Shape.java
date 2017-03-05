
package Prototype.I;

public abstract class Shape {
	public static final String TYPE_CIR = "101";
	public static final String TYPE_REC = "102";
	public static final String TYPE_SQU = "103";
	private String id;
	protected String type;
	
	
	public abstract void getType();
	public abstract Shape clone();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
