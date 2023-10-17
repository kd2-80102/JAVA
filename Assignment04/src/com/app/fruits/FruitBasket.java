package com.app.fruits;

import java.util.*;

class FruitBasket {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public FruitBasket(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }
	
	public String taste() {
		return "No Specific Taste";
	}
	
	public void acceptData() {
		System.out.print("Color of the Fruit : ");
		this.color = new Scanner(System.in).next();
		System.out.print("Weight of Fruit : ");
		this.weight = new Scanner(System.in).nextDouble();
		System.out.print("Name of the Fruit : ");
		this.name = new Scanner(System.in).next();
		System.out.print("Are they Fresh : ");
		this.isFresh = new Scanner(System.in).nextBoolean();
		
	}
	
	public void displayData() {
		System.out.print("Color of the Fruit : " + this.color );
		System.out.print("Weight of Fruit : " + this.weight );
		System.out.print("Name of the Fruit : " + this.name);
		System.out.print("Are they Fresh : " + this.isFresh);
			
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Name: " + name + ",Color: " + color + ", Weight: " + weight;
	}
	
	
	
	
	
	
}




