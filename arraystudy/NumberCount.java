package arraystudy;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int [] arr = new int[4];
		int [] count = new int[10];
		for(int i =0;  i<3; i++) {
			arr[i] = scan.nextInt();
		}
		//위에서 입력받은 3개의 정수의 곱을 배열[3]에 저장
		arr[3] = arr[0] * arr[1] * arr[2];
		
		int  number =arr[3];
		//곱에 대한 자릿수를 계산하여 각 인덱스에 저장
		while(true) {
			if(number==0) {
				break;
			}
			int i = number%10;
			count[i] = count[i]+1;
			number = number/10;
		}
		
		for(int i : count) {
			System.out.println(i);
		}
		
	}
	
}
