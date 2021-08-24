package replex;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		/*
		 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
			n=17일때 까지 피보나치 수를 써보면 다음과 같다.
			0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 
			144, 233, 377, 610, 987, 1597
		 */
		Scanner scan = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		number = scan.nextInt();
		scan.nextLine();
		
		sum = fibo(number);
		System.out.println(sum);
		
		scan.close();
	}
	//정수 n의 피보나치 수열 반환
	//피보나치 수열은 fibo(3) 이 주어졌을떄
	// fibo(2)+fibo(1) 만들어지는 값이므로 밑에처럼 처리
	// 하지만 그전에 값은 포함이 되어있어야 하기 때문에 0과 1은 각각 0과1로 리턴
	static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}
}
