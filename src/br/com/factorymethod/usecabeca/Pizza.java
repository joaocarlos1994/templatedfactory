package br.com.factorymethod.usecabeca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
	
	private final String name;
	private final String dought;
	private final String sauce;
	private final List<String> toppings;
	
	public Pizza(final String name, final String dought, final String sauce, final String topping) {
		super();
		this.name = name;
		this.dought = dought;
		this.sauce = sauce;
		this.toppings = new ArrayList<>(Arrays.asList(topping));
	}
	
	protected void addToppings(final String topping){
		this.addToppings(topping);
	}
	
	public void prepare(){
		System.out.println("Preparing " + this.name);
		System.out.println("Tossing dought...");
		System.out.println("Adding sauce... ");
		System.out.println("Adding toppings:  ");
		//Lambda 
		toppings.forEach(t -> System.out.println(t));
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return this.name;
	}
	
}
