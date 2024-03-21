package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 * 로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
 *   
        i   *위치     
     *  3   3
    **  2   2,3
   ***  1   1,2,3 
 */
public class Exam8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이:");
		int h = scan.nextInt();
		for(int i=h;i > 0;i--) { 
			for(int j=1;j<=h;j++) {
				if(i <= j)	System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
