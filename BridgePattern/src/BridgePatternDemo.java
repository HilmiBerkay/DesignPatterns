
public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle =new Circle("100,100,10" new RedCircle());
		Shape greenCircle("100,100,10",new GreenCircle());
		
		
		redCircle.draw();
		greenCircle().draw();
	}
}
