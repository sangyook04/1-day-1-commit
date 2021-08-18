package baekjoon20210810;

import java.util.Scanner;

public class day_20210818_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String number1 = sc.next();
		String number2 = sc.next();
		
		String sangsuNum1 = (String) (number1.charAt(2) +""+ number1.charAt(1) +""+ number1.charAt(0));
		String sangsuNum2 = (String) (number2.charAt(2) +""+ number2.charAt(1) +""+ number2.charAt(0));
		
		if(Integer.parseInt(sangsuNum1) > Integer.parseInt(sangsuNum2)) {
			System.out.println(sangsuNum1);
		} else {
			System.out.println(sangsuNum2);
		}

	}

}

