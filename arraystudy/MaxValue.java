package arraystudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxValue {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = 1;
		int max = 0;
		//9개의 정수를 담을 배열
		int nums[] = new int[9];
		//9개의 값을 입력
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		//최대값 max와 그 값의 위치 index를 구함
		max = nums[0];
		for(int i=0; i<nums.length-1; i++) {
			if(max<nums[i+1]) {
				max = nums[i+1];
				index = i+2;
			}
		}
		System.out.printf("%d %d",max,index);

		
	}
}
