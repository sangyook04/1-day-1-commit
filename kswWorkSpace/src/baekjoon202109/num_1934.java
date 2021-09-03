package baekjoon202109;

import java.util.Scanner;

public class num_1934 {
		 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int firstNumber = sc.nextInt();
			int secondNumber = sc.nextInt();
			
			System.out.println(lcm(firstNumber, secondNumber));
		}
		
	}
	
	static int gcd(int a, int b){
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}
	
	static int lcm(int a, int b){ 
	    return a * b / gcd(a,b);
	}
	
}
