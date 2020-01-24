
public class Origanator {

	private String state;
	
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
		
	}
	
	public Memento savaStateToMomento() {
		return new Memento(state);
	}
	public void getStateFromMemento(Memento memento) {
		state=memento.getState();
		
	}
}
