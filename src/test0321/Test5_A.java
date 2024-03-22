package test0321;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3        i    j     *
*****    0    0~4   i ~ (b - 1) - i
 ***     1    1~3
  *      2    2~2
 
 */
public class Test5_A {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int bottom = len * 2 - 1;  //바닥의 *의 갯수
		int m = bottom/2;   //중간위치
		for(int i=0;i<len;i++) {
			for(int j=0;j<bottom - i;j++) {
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
