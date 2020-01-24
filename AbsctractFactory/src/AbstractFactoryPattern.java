
public class AbstractFactoryPattern {
	
public static void main(String[] args) {
	
	AbstractFactory ShapeFactory=FactoryProducer.getFactory(false);
	Shape shape1=ShapeFactory.getShape("R");
	shape1.draw();
	
//	AbstractFactory ShapeFactory=FactoryProducer.getFactory(false);
	Shape shape2=ShapeFactory.getShape("Square");
	shape2.draw();
	
	AbstractFactory ShapeFactory1=FactoryProducer.getFactory(true);
	Shape shape3=ShapeFactory1.getShape("R");
	shape3.draw();
	
//	AbstractFactory ShapeFactory=FactoryProducer.getFactory(false);
	Shape shape4=ShapeFactory.getShape("S");
	shape4.draw();
	

	
}

}
