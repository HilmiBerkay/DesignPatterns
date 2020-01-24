
public class ShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType) {
		
		if(shapeType.equals("RectAngle")) {
			return new RectAngle();
			
		}
		else if(shapeType.equals("Circle")) {
			
			return new Circle();
		}
		
		return null;
	}

}
