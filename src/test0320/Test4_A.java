package test0320;

import java.util.Scanner;

/*
 * 윤년 구하기
 *  윤년은 4의 배수 중  100의 배수인경우는 평년, 100의 배수가 아닌 경우는 윤년, 
 *  단 400의 배수는 윤년. 
 *  년도를 입력받아서 윤년, 평년 인지를 출력하기.
 *  [결과]
 *  년도를 입력하세요
 *  2020
 *  윤년
 *  
 *  년도를 입력하세요
 *  2100
 *  평년
 */
public class Test4_A {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(year%4 ==0) { //윤년 가능성
			if(year % 100 == 0) { //평년의 가능성
				if(year%400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			} else {  //윤년
				System.out.println("윤년");
			}
		} else { //평년
			System.out.println("평년");
		}
		//2
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}
}
