
public abstract class Shape implements Cloneable {// cloneable comşng from object (super super class  of java
	
	private String id;
	protected String type;
	abstract void draw();
	

	public String getType() {
		return type;
		
	}
	public String getId() {
		
		return id;
		
	}
	
	public void setId(String id) {
		
		this.id=id;
		
	}
	
	public Object clone() {
		// Object
		Object clone=null;
		try {
			clone=super.clone();
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
		}
		return clone;
		
	}
}
