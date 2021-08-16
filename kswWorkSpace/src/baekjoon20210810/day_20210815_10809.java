package baekjoon20210810;

import java.util.Scanner;

public class day_20210815_10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = sc.nextLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			//아스키 코드 a의 값만큼 빼줘서 문자가 b일 경우 b의 위치를 1로 탐색해준다
			if(arr[ch - 'a'] == -1) {	
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	
			System.out.print(val + " ");
		}
	}

}

