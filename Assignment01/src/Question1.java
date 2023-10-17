import java.util.Scanner; //Import the Scanner class//package ko include karo



public class Question1 { //public class 

	public static void main(String[] args) {
		Scanner myObj = new Scanner (System.in);
		
		System.out.print("Enter the number : ");
		
		int number = myObj.nextInt();
		
		System.out.println("Given Number : "+ number);
		
		
		System.out.print("Binary Equivalent is "+ Integer.toBinaryString(number));
		
		
		
		
		

	}

}
