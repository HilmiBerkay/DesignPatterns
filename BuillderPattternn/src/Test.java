import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareVegMeal();
		System.out.println(	"VegMeal");
		vegMeal.showItems();
		System.out.println("Total cost:"+vegMeal.getCost());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("\n\n Non veg-meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: "+nonVegMeal.getCost());
		
	}
}
interface Item{
	
	public String name();
	public Packing packing();
	public float price();
	
}

interface Packing{
	public String pack();
	
}

class Wrapper implements Packing{
	
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Wrapper";
	}
	
	
}

class Bottle implements Packing{
	
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		return "Bottle";
		
	}
}

abstract class Burger implements Item{
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
public abstract float price();
	}

abstract class ColdDrink implements Item{
	
	public Packing packing() {
		return new Bottle();
		}
	public abstract float price();
}
class VegBurger extends Burger{
	
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg burger";
	}
}

class ChickenBurger extends Burger{
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Non vegburger";
	}
	
}
class Coke extends ColdDrink{
	
	 @Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.2f;
		
	}
	 
	 @Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}
}
class Pepsi extends ColdDrink{
	
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}
}

class Meal{
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
		
	}
	public float getCost() {
		float cost=0.0f;
		
		for(Item item:items) {
			cost +=item.price();
		}
		return cost;
		
	}
	void showItems(){
		for(Item item:items) {
	System.out.println("Item :"+item.name());
	System.out.println(",Packing:"+item.packing().pack());
    System.out.println(",Price:"+item.price());	
    }
		
		
	}
}

class MealBuilder{
	public Meal prepareVegMeal() {
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal()
	{
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}



