package baekjoon20210803;

import java.util.Scanner;

public class day_20210806_3052 {

	public static void main(String[] args) {
		
		Scanner	sc = new Scanner(System.in);
		
		boolean arr[] = new boolean[42];
		
		for(int j=0; j<10; j++) {
			
			arr[sc.nextInt()%42] = true;

		}

		int count = 0;
		for(boolean value : arr) {
            if(value){   
                count++;
            }
        }

		System.out.println(count);
		
	}

}
