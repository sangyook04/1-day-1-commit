package kswWorkSpace;

import java.util.Scanner;

public class day_20210712_10430 {

	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		Scanner	sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);

	}

}
