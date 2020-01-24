
interface DrawApi{
	public void drawCircle(int radius,int x,int y);
}
class RedCircle implements DrawApi{
	public void drawCircle(int radius,int x,int y) {
		System.out.println("Drawing Circle [color :red,radius:"+radius+"x"+x+"y"+y+"]");
	}
}
class GreenCircle implements DrawApi{
	public void drawCircle(int radius,int x,int y) {
	System.out.println("Drawing Circle [color :red ,radius"+radius+",x:"+x+",y:"+y+"]");
	}
}
abstract class Shape{
	protected DrawApi drawapi;
	protected Shape(DrawApi drawapi) {
		this.drawapi=drawapi;
	}
	public abstract void draw();
}
class Circle extends Shape{
	private int x,y,radius;
	public Circle(int x,int y,int radius ,DrawApi drawapi)
	{
		super(drawapi);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void draw() {
		drawapi.drawCircle(radius, x, y);
	}
}
public class BridgePatternDemo {
	public static void main(String[] args) {
		
		Shape redCircle =new Circle(100,100,10,new RedCircle());
		Shape greenCircle=new Circle(100,100,10 ,new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}
