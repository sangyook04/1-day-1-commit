package baekjoon202109;

import java.util.Scanner;

public class day_20210901_5086 {
		 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			int firstNumber = sc.nextInt();
			int secondNumber = sc.nextInt();

			if(firstNumber > secondNumber) {
				
				if(firstNumber % secondNumber == 0) {
			    	System.out.println("multiple");
			    } else {
			    	System.out.println("neither");
			    }
			} else if(firstNumber < secondNumber) {
				
				if(secondNumber % firstNumber == 0) {
			    	System.out.println("factor");
			    } else {
			    	System.out.println("neither");
			    }
			}
			
			if(firstNumber == 0 && secondNumber == 0) {
				break;
			}
			
		}
		
	}
}
