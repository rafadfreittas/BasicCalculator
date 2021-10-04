package firstProject;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		// Formula: F = (C * 1.8) + 32 and C = (F - 32) / 1.8
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("A number in celsius to convert: ");
		double c = input.nextDouble();
		
		double f = c * 1.8 + 32;
		
		System.out.printf("In fahrenheit is %.2f º.", f);
		
		System.out.print("\nA number in fahrenheit to convert: ");
		double f1 = input.nextDouble();
		
		double c1 = (f1 - 32) / 1.8;
		
		System.out.printf("In celsius is %.2f º.", c1);
		
		input.close();
	}
}
