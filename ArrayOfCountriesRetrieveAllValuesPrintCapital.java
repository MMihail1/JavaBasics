package Exercises1JavaBasicsCoding;

import java.util.Scanner;

public class ArrayOfCountriesRetrieveAllValuesPrintCapital {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an array is created,
		// retrieve all values from it and while retrieving those values print capital
		// for each country
		Scanner input = new Scanner(System.in);
		String capital = null;
		String[] country = new String[5];

		System.out.println("Enter 5 countries:");
		for (int i = 0; i < country.length; i++) {
			country[i] = input.next();
		}
		for (int i = 0; i < country.length; i++) {
			switch (country[i].toLowerCase()) {
			case "mexico":
				capital = "mexico df";
				break;
			case "peru":
				capital = "lima";
				break;
			case "spain":
				capital = "madrid";
				break;
			case "turkey":
				capital = "ankara";
				break;
			case "pakistan":
				capital = "islamabad";
				break;
			case "egypt":
				capital = "cairo";
				break;
			case "usa":
				capital = "washington dc";
				break;
			default:
				capital = "Unknown";
				break;
			}
			System.out.println("For " + country[i] + " the capital is " + capital);
		}

		System.out.println(" "); System.out.println("-------Second way outprint with For each/advanced loop-------- "); System.out.println(" ");

		for (String count : country) {
			switch (count) {
			case "mexico":
				capital = "mexico df";
				break;
			case "peru":
				capital = "lima";
				break;
			case "spain":
				capital = "madrid";
				break;
			case "turkey":
				capital = "ankara";
				break;
			case "pakistan":
				capital = "islamabad";
				break;
			case "egypt":
				capital = "cairo";
				break;
			case "usa":
				capital = "washington dc";
				break;
			default:
				capital = "Unknown";
				break;
			}
			System.out.println("For " + count + " the capital is " + capital);
		}
		input.close();
	}

}
