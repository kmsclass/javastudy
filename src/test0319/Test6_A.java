package test0319;

import java.util.Scanner;

//반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6_A {
	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 :");
		int r = scan.nextInt(); 
		System.out.printf("넓이 : %.5f\n" , r*r*pi);
		System.out.printf("둘레 : %.5f\n" , 2*r*pi);		
	}
}
