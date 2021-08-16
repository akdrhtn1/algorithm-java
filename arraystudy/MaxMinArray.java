package arraystudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMinArray {

	public static void main(String[] args) throws IOException {


		//buffereader를 scan보다 빠른 속도를 위해 buffer 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = Integer.parseInt(br.readLine());
		String [] strs = new String[value];
		//해당 구분자 공백으로 나뉘어서 배열 strs에 저장
		strs = br.readLine().split(" ");
		//strs 문자열 배열에 저장된 내용을 stream을 이용해서 nums에 배열에 저장
		int[] nums = Arrays.stream(strs).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(nums);
		
		//정렬된 값에 맨 앞에 최소값 뒤에 최대값을 출력
		System.out.printf("%d %d",nums[0], nums[value-1]);
		
		

	}

}
