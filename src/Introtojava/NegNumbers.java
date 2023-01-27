package Introtojava;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	       int num; 

	       System.out.print("print a number ");
	       
	       num = scanner.nextInt();

	       if(num > 2) {
	           System.out.println("Number is positive");
	           
	       } else if (num < 2) {
	           System.out.println("Number is negative");
	       } else {
	           System.out.println("Number is 0");
	       }
	}

}




