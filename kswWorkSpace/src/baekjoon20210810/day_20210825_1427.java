package baekjoon20210810;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class day_20210825_1427 {
	 
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		
		String[] strArray = N.split("");
		
		Arrays.sort(strArray, Collections.reverseOrder());
	        
        for (String i : strArray) {
            System.out.println(Integer.parseInt(i));
        }
		
	}
 
}
