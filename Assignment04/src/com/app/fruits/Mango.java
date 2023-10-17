package com.app.fruits;
import java.util.*;

class Mango extends FruitBasket {
	public Mango(String name, String color, double weight) {
        super(name, color, weight);
    }
	@Override
	public void acceptData() // method overriding
	{
		super.acceptData();
	}
	
	@Override
	public void displayData() // method overriding
	{

		// this.displayData();
		super.displayData();

	}
	
	@Override
	public String taste() {
	     return "sweet";
	}
	
}
