package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 * 로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
 *   
          i   *위치        
     *    0    2     => 2-0 ~ 2+0 
    ***   1    123   => 2-1 ~ 2+1
   *****  2    01234 => 2-2 ~ 2+2
                      => 바닥의갯수/2  
           바닥*갯수
 높이 1 :   1    : 1 * 2 -1 = 1
 높이 2 :   3    : 2 * 2 -1 = 3 
 높이 3 :   5    : 3 * 2 -1 = 5
 높이 4 :   7    : 4 * 2 -1 = 7
 => 높이 * 2 - 1 => 바닥의 갯수
 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이:");
		int h = scan.nextInt();
		int b = h * 2 - 1;
		int m = b/2;
		for(int i=0;i<h;i++) {
			for(int j=0;j<=m+i;j++) {
				if (j >= m-i && j<= m+i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
