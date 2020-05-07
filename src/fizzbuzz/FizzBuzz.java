package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

	public static String fizzBuzzCheck(int number) {

		if(number <= 0) {
			return String.valueOf(number);
		} else if(number % 15 == 0) {
			String result = "FizzBuzz";
			return result;
		} else if(number % 5 == 0) {
			String result = "Buzz";
			return result;
		} else if(number % 3 == 0) {
			String result = "Fizz";
			return result;
		} else {
			return String.valueOf(number);
		}
	}

	public static void main(String[] args) {

		System.out.println("数字を入力してください");
		Scanner scan = new Scanner(System.in);
		String inputNumber = scan.nextLine();
		scan.close();

		if(!inputNumber.matches("^[0-9]{1,9}$")) {
			System.out.println("整数9桁までの数字を入力してください");
			return;
		}

		String result = fizzBuzzCheck(Integer.parseInt(inputNumber));
		System.out.println(result);
	}
}
