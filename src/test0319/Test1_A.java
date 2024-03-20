package test0319;

import java.util.Scanner;

/*
 * 화면에서 금액입력받아서 500,100,50,10,1원 동전으로 바꾸기.
 * 필요한 동전의 갯수 출력하기. 전체동전은 최소 갯수로 바꾼다.
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원  : 0개
 * 10원 : 4개
 * 1원  : 1개
 */
public class Test1_A {
	public static void main(String[] args) {
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		System.out.println("500원 : " + amt/500 + "개");
		System.out.println("100원 : " + ((amt%500)/100) + "개");
		System.out.println("50원 : " + ((amt%100)/50) + "개");
		System.out.println("10원 : " + ((amt%50)/10) + "개");
		System.out.println("1원 : " +  (amt%10) + "개");
		System.out.println("==================");
		System.out.println("500원 : " + amt/500 + "개");
		amt %= 500;  //금액이 500 동전을 바꾼 후의 잔액 변경
		System.out.println("100원 : " + amt/100 + "개");
		amt %= 100;
		System.out.println("50원 : " + amt/50 + "개");
		amt %= 50;
		System.out.println("10원 : " + amt/10 + "개");
		amt %= 10;
		System.out.println("1원 : " + amt + "개");
	}
}
