package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 * 로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
   *
   **
   ***

 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이:");
		int h = scan.nextInt();
		for(int i=1;i<=h;i++) { //i=2
			for(int j=1;j<=i;j++) { //j=1
				System.out.print("*"); //**
			}
			System.out.println();
		}
	}
}
