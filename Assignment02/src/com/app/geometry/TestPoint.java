package com.app.geometry;

import java.util.*;

class Point2D {
	private double x;
	private double y;
	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
        return "Point(" + x + ", " + y + ")";
    }
	
    public boolean isEqual(Point2D otherPoint) {
    	if(this.x == otherPoint.x && this.y == otherPoint.y) {
    		return true;
    	} else {
    		return false;
    	}    
    }
    
    public double calculateDistance(Point2D anotherPoint) {
        double Xsquare = this.x - anotherPoint.x;
        double Ysquare = this.y - anotherPoint.y;
        double distance = Math.sqrt(Xsquare * Xsquare + Xsquare * Xsquare);
        return distance;
    }
    	
	
}

public class TestPoint{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates for Point 1:");
        System.out.print("Enter x coordinate: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y1 = sc.nextDouble();
        
        
        System.out.println("Enter the coordinates for Point 2:");
        System.out.print("Enter x coordinate: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y2 = sc.nextDouble();
        
        
        sc.close();
        
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);
        
        
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());
        
        
        boolean isEqual = p1.isEqual(p2);
        System.out.println("Are Point 1 and Point 2 equal? " + isEqual);

        
        double distance = p1.calculateDistance(p2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
        
	}

}
