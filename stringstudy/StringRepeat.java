package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringRepeat {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());

		String[] str = new String[count];
		String[] temp = new String[count];
		StringBuilder result = new StringBuilder();
		//String[] result = new String[count];
		for(int i = 0; i< count; i++) {
			str[i] = br.readLine();
		}
		// 문자열의 반복 갯수와 문자열을 temp에 저장.
		for(int i =0; i<count; i++) {
			temp = str[i].split(" ");
			// 저장된 문자열 문자당 result에 저장(stringBulider는 가변이기 때문에 string보다 효율적이므로 선택)
			for(int j=0; j<temp[1].length();j++) {  
				for(int k=0; k<Integer.parseInt(temp[0]);k++) {
					result.append(temp[1].charAt(j));                  
				}
			}
			// 다음 칸으로 바낄떄 줄바꿈을 추가
			result.append("\n");
		}
		
		System.out.println(result);
	
	}
}