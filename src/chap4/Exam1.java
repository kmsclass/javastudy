package chap4;

import java.util.Scanner;

/*
 * 정수를 입력받아서
 * 1. 양수/음수/영 출력하기
 * 2. 짝수/홀수 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		System.out.println();  //한줄 출력
		System.out.print(num);
		System.out.print(":");
		if(num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("영");
		}
		//조건 연산자로 출력
		System.out.print(num + ":");
		System.out.println((num > 0)?"양수":(num < 0)?"음수":"영");
		System.out.print(num + ":");
		if(num%2==0) {
			System.out.println("짝수");
		} else if(num%2==1) {
			System.out.println("홀수");
		}
		//조건 연산자로 출력
		System.out.print(num + ":");
		System.out.println((num%2==0)?"짝수":"홀수");
	}
}
