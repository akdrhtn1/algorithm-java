package arraystudy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class AverageNum {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i =0;
		int count = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine()," ");	
		
		int arr[] = new int[count];	
		double result[] = new double[count];
		
		//공백 구분자로 저장된 스트링토크나이저 값을 정수형 배열에 저장
		while(stz.hasMoreTokens()) {
			arr[i] = Integer.parseInt(stz.nextToken());
			i++;
		}
		//정수형 배열에 값을 stream을 이용해 max값을 추출
		Integer max = Arrays.stream(arr).max().getAsInt();	
		
		for(int j =0; j<result.length; j++) {
			result[j] = (arr[j]/(double)max)*100;
		}
		//점수/M*100 연산후 저장된 값을 avg에 저장
		Double avg = Arrays.stream(result).average().getAsDouble();
		
		System.out.println(avg);

	}

}
