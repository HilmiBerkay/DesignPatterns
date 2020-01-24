
public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Wrapper();
		
	}
	public abstract float price();
	
	
}

