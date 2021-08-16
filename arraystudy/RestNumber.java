package arraystudy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class RestNumber {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] num = new int[10];
		int count = 10;
		for(int i=0; i<10; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		//위에서 입력받은 10개의 숫자의 각 42로 나눈 나머지를 각자리의 인덱스에 할당
		for(int i=0; i<10; i++) {
			num[i] %= 42;
		}
		Arrays.sort(num);
		//같은 값이 있을경우 -연산
		for(int i =0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] == num[j]) {
					count--;
					break;
				}
			}
			
		}
		//서로 다른 값의 갯수를 출력
		System.out.println(count);
	}
	
}
