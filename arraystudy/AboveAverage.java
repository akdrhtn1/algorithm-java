package arraystudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AboveAverage {
	/*
	 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
	   둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
	   이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		String[] nums = new String[count];
		String[][] str = new String[count][];
		int[][] result = new int[count][]; //int형 배열을 담을 배열
		double[] avgResult = new double[count];
		int moreThen = 0 ; //평균이상 인원 수임
		
		//2차원 배열에 값을 넣기 공백 구분자로 나뉨
		for(int i=0;i<count; i++) {
			nums[i] = br.readLine(); 
			//입력 받은 값
			str[i] = nums[i].split(" ");
			//int형 배열로 변경
			result[i] = Arrays.stream(str[i]).mapToInt(Integer::parseInt).toArray();
		}
		
		//맨 앞의 배열에 각 자리 평균값을 넣음	
		for(int i =0; i<str.length; i++) {
			int temp = result[i][0];
			for(int j=1; j<str[i].length; j++) {
				result[i][0] += result[i][j];
			}

			result[i][0] = (result[i][0] - temp)/temp; //[0]에 결과를 저장
		}
		//총학생의 평균 넘는 학생을 avgResult배열에 넣음
		for(int i =0; i<result.length; i++) {
			
			for(int j=1; j<result[i].length; j++) {
				// result[i].length-1 과목 평균이지
				if(result[i][0]<result[i][j]) {
					moreThen++;
				}
			}
			double length = result[i].length-1;
			avgResult[i] = (moreThen/length)*100.00;
			moreThen = 0;
		}
		
		//소수3번째자리 까지 출력
		for(double resul : avgResult) {
			System.out.printf("%.3f%%\n",resul);
		}

		
		
	}

}
