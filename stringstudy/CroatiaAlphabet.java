package stringstudy;

import java.util.Scanner;

public class CroatiaAlphabet {
/*
   예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
   단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

	dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 
	위 목록에 없는 알파벳은 한 글자씩 센다
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		int count = 0;
		char tempChar;
		for (int i = 0; i < str.length(); i++) {
			count++;
			// dz= 의 크로아티아 알파벳일 경우 -해줌 d일 경우 다음 조건을 실행하기 위해 
			// i+1의 범위가 있어야 하므로 i의 위치보다 <전체범위 -1보다 작은지 확인
			// 그러고 -1 z=은 밑에서 중복으로 -1 하기떄문에 총 dz= =>1의 값이됨 
			if (str.charAt(i) == 'd' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'z' && i < str.length() - 2) {
					if (str.charAt(i + 2) == '=') {
						count -= 1;  // 
					}
				}
				
				//=c,=z,=s 의경우 -1을 위에서 count++ 되었기 떄문
			} else if (str.charAt(i) == '=') {
				tempChar = str.charAt(i - 1);

				if (tempChar == 'c' || tempChar == 's' || tempChar == 'z') {
					count -= 1;
				}
			}
			// c-, d-일 경우
			else if (str.charAt(i) == '-') {
				tempChar = str.charAt(i - 1);
				if (tempChar == 'c' || tempChar == 'd') {
					count -= 1;
				}
			}
			// nj, lj 일 경우
			else if (str.charAt(i) == 'j' && i != 0) {
				tempChar = str.charAt(i - 1);
				if (tempChar == 'n' || tempChar == 'l') {
					count -= 1;
				}
			}

		}
		System.out.println(count);

	}

}
