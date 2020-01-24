
public class MementoPattern {
	public static void main(String[] args) {
		Origanator origanator= new Origanator();
		CareTaker careTaker=new CareTaker();
		
		origanator.setState("State #1");
		origanator.setState("State #2");
	    careTaker.add(origanator.savaStateToMomento());
	    
	    origanator.setState("State #3");
	    careTaker.add(origanator.savaStateToMomento());
	    origanator.setState("State #4");
	    System.out.println("Current origanator:"+origanator.getState());
	    
	    origanator.getStateFromMemento(careTaker.get(0));
      System.out.println("First	 saved state:"+origanator.getState());
	    origanator.getStateFromMemento(careTaker.get(1));
	      System.out.println("second	 saved state:"+origanator.getState());
      
	}

}
