package _01_random._6_lottery_numbers;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Random randomMaker = new Random();
		for (int i=0;i<10;i++) {
		int randomNumber = randomMaker.nextInt(7);
		
		if (randomNumber == 1) {System.out.println("1");}
		else if (randomNumber == 2) {System.out.println("2");}
		else if (randomNumber == 3) {System.out.println("3");}
		else if (randomNumber == 4) {System.out.println("4");}
		else if (randomNumber == 4) {System.out.println("5");}
		else if (randomNumber == 0) {System.out.println("0");}
				// 2. Repeat all the code above 10 times
	}

}
