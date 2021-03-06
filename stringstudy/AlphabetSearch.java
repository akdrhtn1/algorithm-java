package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetSearch {

public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] alpha = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
				      ,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
				      ,-1,-1,-1,-1,-1,-1};
		//알파벳을 가지고 있을 배열을 선언한다
		char[] temp = new char[str.length()]; 
		
		
		// 저장되어있는 문자열을 알파벳마다 temp에 저장
		for(int i =0; i<str.length(); i++) {
			temp[i] = str.charAt(i);
		}
		//a는 아스키코드가 97이므로 97을 빼면 현 위치가 나옴
		for(int i=0; i<temp.length; i++) {
			//if문을 쓰지 않으면 값이 뒤에 똑같은 알파벳이 있으경우 그 위치로 바뀜
			if(alpha[temp[i]-97]==-1)
				alpha[temp[i]-97] = i;
		}
		
		for(int ab : alpha) {
		System.out.printf(ab+ " ");
		}

	}

}
