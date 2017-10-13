package is.ru.stringcalculator;

import java.util.ArrayList; 

public class Calculator {

	public static int add(String text) {
		if (text.equals("")){
			return 0;
		}
		else 
			if (text.contains(",") || text.contains("\n")) {
				String numbers[] = text.split(",|\n");
				checkNegatives(numbers);
				return sum(numbers);
			}
		return 1;
	}

	private static void checkNegatives (String [] numbers) {
		ArrayList<Integer> negArray = new ArrayList<Integer>();
		for (String number : numbers) {
			if (toInt(number.trim()) < 0) {
				negArray.add(toInt(number));
				}	
			}

		if (negArray.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + negArray.toString());
		}
		else {
			return;
		}
	}

	private static int toInt (String number) {
		return Integer.parseInt(number);
	}

	private static int sum (String [] numbers) {
		int total = 0;
		for (String number : numbers) {
			if (toInt(number.trim()) <= 1000) {
				total += toInt(number);
			}
		}
		return total;
	}
}



 





