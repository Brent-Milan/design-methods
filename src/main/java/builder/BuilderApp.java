package builder;

public class BuilderApp {
	
	public static void main(String[] args) {
	
	MealBuilder mealBuilder = new MealBuilder();
	
	Meal vegMeal = mealBuilder.prepareVegMeal();
	System.out.println("Veg meal:");
	vegMeal.displayItems();
	System.out.println("Total meal cost: " + vegMeal.getCost() + "\n");
	
	Meal meatMeal = mealBuilder.prepareNonVegMeal();
	System.out.println("Non-veg meal:");
	meatMeal.displayItems();
	System.out.println("Total meal cost: " + meatMeal.getCost());
	
	
	}
}
