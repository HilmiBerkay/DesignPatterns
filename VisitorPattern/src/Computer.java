
public class Computer implements ComputerPart {
	
  ComputerPart[] parts;
  
  public Computer() {
	  parts=new ComputerPart[] {new Mause(),new Keyboard(),new Monitor()};	
	  
  }
  
  public void accept(ComputerPartVisitor   computerPartVisitor) {
	  
	  for( int i=0	;i<parts.length;i++) {
		  parts[i].accept(computerPartVisitor);
	  }
  }
		
}
