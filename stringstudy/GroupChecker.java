package stringstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GroupChecker {
	
	/*
	 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 
	 * 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, 
	 * ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
	 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
	 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
	 *	단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		int num = Integer.parseInt(br.readLine());

		int total = 0;
	
		List<String> list = new ArrayList<>();
		//list로 라인 읽기
		for (int i = 0; i < num; i++) {
			list.add(br.readLine());
		}
		
		for (int i = 0; i < list.size(); i++) {
			count = 1;
			for (int j = 0; j < list.get(i).length(); j++) {
				if (j < list.get(i).length() - 1) {
					if (list.get(i).charAt(j) != (list.get(i).charAt(j + 1))) {
						// k번째부터 중복된 값이 있는지 찾음
						int check2 = list.get(i)
								.indexOf(list.get(i).charAt(j),j+1);
						
						while (check2 != -1) {
							count=0;
							check2 = list.get(i)
									.indexOf(list.get(i).charAt(j),check2+1);	
							
						}

					}
				}
				//	중복된 값이 없으면 1 중복된 값이 있으면 0 
				//	없을 경우 total에 값이 추가
			}if(count>0) {
				total++;
			}
		}
		System.out.println(total);
		br.close();
		
		
	}
}
