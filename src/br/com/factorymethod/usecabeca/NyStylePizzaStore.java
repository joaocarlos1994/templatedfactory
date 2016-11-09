package br.com.factorymethod.usecabeca;

public class NyStylePizzaStore extends PizzaStore {
	
	private Pizza pizza;

	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			this.pizza = new NYStykeCheesePizza();
		} 
		
		return pizza;
	}
	
	
	
}
