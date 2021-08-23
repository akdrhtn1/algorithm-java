package replex;

import java.util.Scanner;

public class Factorial2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		number = scan.nextInt();
		scan.nextLine();
		
		sum = factorial(number);
		System.out.println(sum);
	}
	//정수 n의 펙토리얼 반환
	static int factorial(int n) {
		
		if(n>0){
			return n * factorial(n-1);
		
		}else {
			return 1;
		}
		
	}
}
