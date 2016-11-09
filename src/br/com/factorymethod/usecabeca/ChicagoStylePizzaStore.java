package br.com.factorymethod.usecabeca;

public class ChicagoStylePizzaStore extends PizzaStore {

	private Pizza pizza;
	
	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			this.pizza = new ChicagoStyleCheesePizza();
		}
		return pizza;
	}

}
