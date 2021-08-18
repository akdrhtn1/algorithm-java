package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpaceCount {
//	첫째 줄에 단어의 개수를 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		sb.append(br.readLine());
		// 공백단위로 문자열을 나눔
		StringTokenizer stz = new StringTokenizer(sb.toString()," ");
		
		//나눈 문자열에 따라 갯수를 계산 
		while(stz.hasMoreTokens()) {
			stz.nextToken();
			count++;
			
		}
		System.out.println(count);
				
			

	}

}
