package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DialString {

	public static void main(String[] args) throws IOException {
		/*
		 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
		 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

		숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 
		한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

		상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 
		어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
		
		할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		
		int temp = 0;
		// 문장의 값을 저장할 결과 선언
		int result = 0;
		int dialValue = 0;


		for(int i=0; i<sb.length(); i++) {
			//A부터 시작되는데 (A,B,C)값은 초기에 3으로 시작하기 때문에 65-56 =9
			// 9/3 을하여 3부터 시작하여 그 한 문장씩 읽어와 그 값을 result와 더함
			temp = Integer.valueOf(sb.charAt(i));
			
			// P~S : 80 ~ 83
			// W~Z : 87 ~ 90
			//PQRS는 4개씩 묶여있기 때문에 나누기 4 하고 8로 시작해야 하기때문에 -48
			if(temp >=80 && temp<=83) {
				dialValue = (temp-48)/4;
			}
			//WXYZ도 4개씩 묶여있다.
			else if(temp >=87 && temp<=90) {
				dialValue = (temp-47)/4;
			
			}else if(temp == 86) {
				dialValue = (temp-50)/4;
			}
			else {
				dialValue = (temp-56)/3;
			}
			result += dialValue;
		}
		System.out.println(result);
		
		br.close();

	}

}
