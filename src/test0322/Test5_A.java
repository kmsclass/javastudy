package test0322;

import java.util.Scanner;

/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기

[결과] 
금액을 입력하세요
36000
동전이 부족합니다.

[결과] 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/
public class Test5_A {
	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		int maxmoney = 0; //바꿔줄수 있는 최대 금액
		for (int i = 0; i < coin.length; i++) {
			maxmoney += coin[i] * cnt[i];
		}
		if (money > maxmoney) {
			System.out.println(maxmoney + ":동전이 부족합니다.");
		} else {  
		  for (int i = 0; i < coin.length && money > 0; i++) {
		    int coinNum = money / coin[i]; //계산된 동전 갯수
			if (cnt[i] < coinNum) { 
				coinNum = cnt[i]; //5
				cnt[i] = 0; //소유하고 있는 동전의 갯수를 0
			} else {   //소유하고 있는 동전의 갯수 내
				cnt[i] -= coinNum;
			}
			money -= coinNum * coin[i];
			System.out.println(coin[i] + "원:" + coinNum);
		  }
		  for (int i = 0; i < coin.length; i++) {
			System.out.println
			 ("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
		  }
		}
	}
}
