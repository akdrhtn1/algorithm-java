package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ManyString {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// String str = br.readLine();
		sb.append(br.readLine());

		int[] arr = new int[26];
		int count = 0;

		for (int i = 0; i < sb.length(); i++) {
			// if문으로 아스키 문자 65[대문자 A] ~ 90[Z]일경우
			char sbDate = sb.charAt(i);
			if (sbDate >= 65 && sbDate <= 90) {
				arr[sbDate - 65] = ++arr[sbDate - 65];
				// 97[소문자 a] ~ 122[z]
			} else if (sbDate >= 97 && sbDate <= 122) {
				arr[sbDate - 97] = ++arr[sbDate - 97];
			}
		}

		
		int max = Arrays.stream(arr).max().getAsInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				count++;
			}
		}
		
		// 마지막으로 가장 큰 인덱스에 +65하면 가장 큰 알파벳이 나옴
		for (int i = 0; i < arr.length; i++) {
			if (count == 1) {
				if (arr[i] == max) {
					System.out.println((char)(i+65));
				}
			}else {
				System.out.println('?');
				break;
			}
		}



	}
}
