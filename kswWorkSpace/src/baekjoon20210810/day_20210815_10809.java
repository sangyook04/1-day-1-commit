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
    
			//�ƽ�Ű �ڵ� a�� ����ŭ ���༭ ���ڰ� b�� ��� b�� ��ġ�� 1�� Ž�����ش�
			if(arr[ch - 'a'] == -1) {	
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	
			System.out.print(val + " ");
		}
	}

}

