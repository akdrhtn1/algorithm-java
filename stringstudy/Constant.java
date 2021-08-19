package stringstudy;

import java.util.Arrays;
import java.util.Scanner;

public class Constant {
/*상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
 * 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
 * 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
   상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
   예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
   따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
   두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오. 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//스트링 빌더에 문자열을 입력
		sb.append(scan.nextLine());
		// 입력 받은 문자열을 reverse 시킴
		sb.reverse();
		//해당 문자열을 공백 단위로 나눠서 받음
		String[] str = sb.toString().split(" ");
		//문자열 배열 -> int형 배열로 바꿈
		int[] nums = Arrays.stream(str).mapToInt(Integer :: parseInt).toArray();
		
		if(nums[0] > nums[1]) {
			System.out.println(nums[0]);
		}else {
			System.out.println(nums[1]);
		}
		
	}

}
