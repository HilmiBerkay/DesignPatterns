
public class Monitor implements ComputerPart {

	public void accept(ComputerPart computerPartVisitor) {
	computerPartVisitor.visit(this);
	
	}
}
