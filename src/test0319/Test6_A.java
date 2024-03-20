package test0319;

import java.util.Scanner;

//반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6_A {
	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름 :");
		int r = scan.nextInt(); 
		System.out.println("넓이 : " + (r*r*pi));
		System.out.println("둘레 : " + (2*r*pi));	
		System.out.println("넓이 : " + (int)(r*r*pi*100)/100.0);
		System.out.println("둘레 : " + (int)(2*r*pi * 100)/100.0);	
		System.out.printf("넓이 : %.2f\n" , r*r*pi);
		System.out.printf("둘레 : %.2f\n" , 2*r*pi);	
		
	}
}
