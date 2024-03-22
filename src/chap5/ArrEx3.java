package chap5;

import java.util.Arrays;

/*
 * Lotto 번호 생성하기
 */
public class ArrEx3 {
	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		for(int b:balls) System.out.print(b+",");
		System.out.println();
		//balls 섞기
		for(int i=0;i<=1000;i++) {
			int f = (int)(Math.random() * balls.length); //0~44, 40
			int t = (int)(Math.random() * balls.length); //0~44, 3
			//swap 알고리즘
			int tmp = balls[f];  //tmp = balls[40], tmp:41 
			balls[f] = balls[t]; //balls[40] = balls[3], balls[40]:4
			balls[t] = tmp;      //balls[3] = tmp,       balls[3]:41  
		}
		for(int b:balls) System.out.print(b+",");
		System.out.println();
		//lotto 번호 저장하기 : balls의 값 앞에서 6개
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=balls[i];
		}
		for(int b:lotto) System.out.print(b+",");
		System.out.println();
		//lotto 정렬하기
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<lotto.length-1-i;j++) {
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
				}
			}
			System.out.print(i+":");
			for(int b:lotto) System.out.print(b+",");
			System.out.println();
		}
		//Arrays 클래스를 이용한 정렬
		//Arrays : 배열 객체의 다양한 기능을 제공해 주는 클래스 
		for(int i=0;i<lotto.length;i++) {  //정렬이전으로 lotto 배열 변경
			lotto[i]=balls[i];
		}
		for(int b:lotto) System.out.print(b+",");
		System.out.println();
		Arrays.sort(lotto);
		for(int b:lotto) System.out.print(b+",");
		System.out.println();
		
	}
}
