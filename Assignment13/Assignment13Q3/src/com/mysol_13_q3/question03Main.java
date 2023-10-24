package com.mysol_13_q3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class question03Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try(FileWriter fileWriter = new FileWriter("Q3.txt")){
			try(BufferedWriter bw = new BufferedWriter(fileWriter)){
				for (int i = 1; i <= 4; i++) {
	                System.out.print("Enter line " + i + ": ");
	                String line = sc.nextLine();
	                bw.write(line);
	                bw.newLine(); // Add a newline character after each line
				}
			}
		} catch (IOException e) {
		            e.printStackTrace();
			}
		
	}
}
			

