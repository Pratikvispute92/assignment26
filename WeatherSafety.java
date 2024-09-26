package assignment26;

import java.util.Scanner;

public class WeatherSafety {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the temperature in °C: ");
		int temperature = sc.nextInt();
		System.out.print("Is it raining? (true/false): ");
		boolean isRaining = sc.nextBoolean();

		
		if (temperature >= 20 && temperature <= 30 && !isRaining) {
			System.out.println("It is safe to go outside.");
		} else {
			System.out.println("It is not safe to go outside.");
		}

		
	}
}
