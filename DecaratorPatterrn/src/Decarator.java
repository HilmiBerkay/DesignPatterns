

interface Shape{
	void draw();
	
}
class Rectangle implements Shape{
	public void draw() {
		System.out.println("Shape ::Rectangle");
	}
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Shape:Circle");
	}
}

abstract class ShapeDecarator implements Shape{
	protected Shape decoratedShape;
	public ShapeDecarator(Shape decoratedShape) {
		this.decoratedShape=decoratedShape;
		
	}
	public void draw() {
		decoratedShape.draw();
	}
}
 class RedShapeDecorator extends ShapeDecarator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border color :red");
	}
}

public class Decarator {
public static void main(String[] args) {
	Shape circle=new Circle();
	Shape redCircle=new RedShapeDecorator(new Circle());
	Shape redRectangle=new RedShapeDecorator(new Rectangle());
	 System.out.println("Circle with normal border");
	 circle.draw();
	 System.out.println("\n Circle of red border");
	 redCircle.draw();
	 System.out.println("\n Rectangle of red border:");
	 redRectangle.draw();
	
}
}
