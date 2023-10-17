package solution02.tester;

import java.util.Scanner;

import solution02.point2d.Point2D;

public class TestPointArray1 {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - Number Conversion");
		System.out.println("0. EXIT");
		System.out.println("1. Display on index");
		System.out.println("2. Display all");
		System.out.println("3. Distance between 2 points ");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("************************************");
		return choice;
	}


	public static void main(String[] args) {
		
		int number;
		int choice;
		int x,y;
		
		System.out.print("Please enter how many points you want :");
		
		number = sc.nextInt();
		
		Point2D arr[] = new Point2D[number];
		
		for(int i=0;i<number;i++) {
			System.out.println("Please enter x:");
			x = sc.nextInt();
			System.out.println("Please enter y:");
			y = sc.nextInt();
			arr[i] = new Point2D(x, y);
		}
		
		while((choice = menu()) != 0) {
			switch(choice) {
			case 1:
				System.out.println("Please enter index:");
				x = sc.nextInt();
				if(x > arr.length) 
					System.out.println("Invalid index , pls retry!!!!");
				
				
				else
					System.out.println(arr[x].getDetails());
					break;
					
			case 2:
					for(Point2D point : arr)
						System.out.println(point.getDetails());
					break;
					
			case 3:
				System.out.println("Please enter index x:");
				x = sc.nextInt();
				System.out.println("Please enter index y:");
				y = sc.nextInt();
				
				if (x > arr.length || y > arr.length)
					System.out.println("Invalid index , try again !!!");
				else
					System.out.println("Distance is : " + arr[x].calculateDistance(arr[y]));
				break;
			
			default:
				break;
			}
			
			
		}	
		
	}
		
}
