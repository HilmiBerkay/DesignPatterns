
public class RoundedShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType) {
		if(shapeType.equals("R"))
		{
			return new RoundedRectangle();
			
		}
		else if(shapeType.equals("S")) {
			
			return new RoundedSquare();
		}
		
		
	return null;	
	}

}
