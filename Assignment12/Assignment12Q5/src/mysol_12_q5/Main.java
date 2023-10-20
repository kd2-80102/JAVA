package mysol_12_q5;

import java.util.Scanner;

@FunctionalInterface
interface Check<T> {
    boolean compare(T x, T y);//{(x, y) -> x.equals(y)};
}

public class Main {
	
	 static <T> int countRepetitions(T[] arr, T key, Check<T> c) {
	        int count = 0;
	        for (T element : arr) {
	            if (c.compare(element, key)) {
	                count++;
	            }
	        }
	        return count;
	    }
	
    public static void main(String[] args) {
        Double[] doubleArr = {1.5, 2.0, 3.5, 1.5, 4.0, 2.5, 1.5}; // Array of Double values
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the key to count repetitions: ");
        double key = scanner.nextDouble();

        int cnt = countRepetitions(doubleArr, key, (x, y) -> x.equals(y));
        System.out.println("Count = " + cnt);
    }

   
}

