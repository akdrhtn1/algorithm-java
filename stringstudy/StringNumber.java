package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int sum =0;
		
		//5개의 숫자만큼 표시
		String str = br.readLine();
		for(int i=0; i<count; i++) {
			char a = str.charAt(i);
			
		}
		
		System.out.println(sum);
	}

}
