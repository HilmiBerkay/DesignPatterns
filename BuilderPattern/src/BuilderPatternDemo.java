
public class BuilderPatternDemo {
	public static void main(String[] args) {
		
		MealBuilder mealbuilder=new MealBuilder();
		
		Meal vegMeal=mealbuilder.prepareVegMeal();
		System.out.println("Veg meal");
		vegMeal.showItems();
		System.out.println("Total Cost:"+vegMeal.getCost());
		
		
		Meal nonVegMeal= mealbuilder.preapereNonVegMeal();
		System.out.println("\n \n Non VegMeal");
		nonVegMeal.showItems();
		System.out.println("Total Cost :"+nonVegMeal.getCost());	
	}
}
