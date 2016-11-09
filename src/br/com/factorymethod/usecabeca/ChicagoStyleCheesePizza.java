package br.com.factorymethod.usecabeca;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		super("Chicago Style Deep Dish Cheese Pizza", "Extra Thinck Crust Dough", "Plum Tomato Sauce", "Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
