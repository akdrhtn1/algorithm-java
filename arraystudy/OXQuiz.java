package arraystudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OXQuiz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0; 
		int result = 0; 

		int num = Integer.parseInt(br.readLine());
		String str[] = new String[num]; 
		int nums[] = new int[num]; 

		//문자열 배열에 입력될 문자열(OXOOXO)을 저장
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		//해당 문자열이 O일경우 값이 증가 연속일 경우 +1 +2 +3 증가
		for (int i = 0; i < str.length; i++) {

			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j) == 'O'){
					result += ++count;  
				}else {
					count = 0;
				}	
			}
			
			nums[i] = result;
			count  = 0;
			result = 0;
			
		}
		for(int arr : nums) {
			System.out.println(arr);
		}

	}

}
