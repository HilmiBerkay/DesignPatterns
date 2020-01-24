
public class Keyboard implements ComputerPart {

	public void accept(ComputerPart computerPartVisitor) {
	computerPartVisitor.visit(this);
	
	}
}
