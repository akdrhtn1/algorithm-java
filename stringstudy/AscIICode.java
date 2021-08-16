package stringstudy;

import java.util.Arrays;
import java.util.Scanner;

public class AscIICode {
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt(); //숫자 문자 갯수
		scan.nextLine();
		//문자열의 값을 받기
		String str = scan.nextLine();
		int sum[] = new int[count];
		//해당 문자열의 아스키단어를 -'0'빼서 숫자를 정수 배열에 저장
		for(int i=0; i<sum.length; i++) {
			sum[i] = str.charAt(i) - '0';
		}
		//값의 합을 구함
		int result = Arrays.stream(sum).sum();
		
		System.out.println(result);

	}

}
