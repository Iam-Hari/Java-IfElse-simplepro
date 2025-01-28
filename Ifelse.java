package w3schoollearn;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		int doorcode = 1337;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the doorcode:");
		int a=sc.nextInt();
		if(doorcode==a) {
			System.out.println("Correct code. The door is now open.");
		} else {
			System.out.println("Wrong code. The door remains closed.");
		}
		
		
	}
}
