package com.mysol_13_q4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class question04Main {

	Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 Strings : ");
		try (FileWriter fwr = new FileWriter("file.txt")) {
			try (BufferedWriter bout = new BufferedWriter(fwr)) {
				for (int j = 0; j < 4; j++) {
					String line = scan.nextLine();
					bout.write(line + "\n");
					//bout.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = "";
		try (FileReader fir = new FileReader("file.txt")) {
			try (BufferedReader br = new BufferedReader(fir)) {
				while ((str = br.readLine())!= null) 
					System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
			

