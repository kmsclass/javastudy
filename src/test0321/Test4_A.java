package test0321;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
 높이
   3  : 5+3+1 = 9
   5  : 9+7+5+3+1 = 25        
*/
public class Test4_A {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(); 
		int bottom = len * 2 - 1;
		int data = 0; //첫번째 숫자 값 저장
		for(int i=bottom;i>=1;i-=2) {
			data += i;
		}
		int m = bottom/2;  //중간위치 
		for(int i=0;i < len;i++) {
			for(int j=0;j<bottom;j++) {
				if(j>=m-i && j<=m+i)
//					System.out.print(data-- + "\t");
					System.out.printf("%5d",data--);
				else
//					System.out.print("\t");
					//%c : 문자출력, %d:10진정수, %f:실수값, %s : 문자열
					System.out.printf("%5s"," ");
			}
			System.out.println();
		}
	}
}