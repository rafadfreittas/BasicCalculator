package firstProject;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		// Importing java.util.Scanner to design the calculator:
		
		Scanner input = new Scanner(System.in);
		
		// Inform the first number:
		
		System.out.print("First number: ");
		double n1 = input.nextDouble();
		
		// Inform the second number:
		
		System.out.print("Second number: ");
		double n2 = input.nextDouble();
		
		// Inform the operator:
		
		System.out.print("Operator: ");
		String op = input.next();
		
		// Using ternary operators to design the operations: 
		
		double res = "+".equals(op) ? n1 + n2 : 0;
		res = "-".equals(op) ? n1 - n2 : res;
		res = "*".equals(op) ? n1 * n2 : res;
		res = "/".equals(op) ? n1 / n2 : res;
		res = "%".equals(op) ? n1 % n2 : res;
		
		// Result:
		
		System.out.printf("%.2f %s %.2f = %.2f" , n1 , op , n2, res);
		
		input.close();
	}
}
