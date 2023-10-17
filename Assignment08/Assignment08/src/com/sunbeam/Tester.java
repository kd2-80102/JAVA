package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m  = new manager();
		m.accept();
		m.display();
		
		Box <manager> b1 = new Box<>();
		
		b1.set(m);
		
	}

}
