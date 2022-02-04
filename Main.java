package java2lab03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How many fruits?");
		int totalFruit = scan.nextInt();

		Fruit[] fruits = new Fruit[totalFruit];

		System.out.println("How many apples?");
		int numOfApple = scan.nextInt();

		for (int i = 0; i < numOfApple; i++) {
			double price = scan.nextDouble();
			String arrivalDay = scan.nextLine();

			fruits[i] = new Apple(price, arrivalDay);
		}

		System.out.println("How many oranges?");
		int numOfOrange = scan.nextInt();

		for (int i = numOfApple; i <= totalFruit - numOfOrange; i++) {
			double price = scan.nextDouble();
			String arrivalDay = scan.nextLine();

			fruits[i] = new Orange(price, arrivalDay);
		}

		System.out.println("How many bananas?");
		int numOfBanana = scan.nextInt();

		for (int i = numOfApple + numOfOrange; i < totalFruit; i++) {
			double price = scan.nextDouble();
			String arrivalDay = scan.nextLine();

			fruits[i] = new Banana(price, arrivalDay);
		}

		double sum = 0;
		for (int i = 0; i < totalFruit; i++) {
			sum += fruits[i].getPrice();
		}
		double average = sum / totalFruit;

		System.out.println("Average price of a fruit is " + String.format("%.02f", average));

		scan.close();
	}

}
