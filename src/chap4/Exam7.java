package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 * 로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
 *     i
   *** 3 3개
   **  2 2개
   *   1 1개

 */
public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이:");
		int h = scan.nextInt();
		for(int i=h;i > 0;i--) { 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
