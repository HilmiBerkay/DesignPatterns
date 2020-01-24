
interface Shape{
	
 void draw();
	
}

class Rectangle implements Shape{
	
	public void draw() {
		System.out.println("Inside rectangle::draw(method)");
		
	};	
}

class Circle implements Shape{
	
	@Override
	public void draw() {
		System.out.println("Inside circle :: draw(MEthod)");	
	}	
}

class Square implements Shape{
	
	@Override
	public void draw() {
	System.out.println("Inside Square::draw() method");
	
	
	}
}

 class ShapeFactory{
	 
	 public Shape getShape(String shapeType) {
		 
		 if(shapeType==null) {
			 return null;
			 
		 }
		 if(shapeType.equalsIgnoreCase("Circle")) {
			 return new Circle();
		 }
			 else if(shapeType.equalsIgnoreCase("Square")){
				 return new Square();
		 }
			 else if(shapeType.equalsIgnoreCase("Rectangle")) {
				 return new Rectangle();
		 }
		 return null;
	 }
 }
 
 
 

public class Main {
 public static void main(String[] args) {
 ShapeFactory Shapefactory=new ShapeFactory();
	Shape shape1=Shapefactory.getShape("Circle");
	shape1.draw();
	Shape shape2=Shapefactory.getShape("Square");
	shape2.draw();
	Shape shape3=Shapefactory.getShape("Rectangle");
	shape3.draw();
	
}
}




