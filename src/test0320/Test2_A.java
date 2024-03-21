package test0320;
/*
 시스템과 가위(1), 바위(2), 보(3)를 하기
  시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
  한개의 숫자를 입력받아 가위바위보 게임하기 
  
  [결과]
  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  사용자 승리!

  가위(1), 바위(2), 보(3) 를 숫자로 입력하세요
  1
  시스템 승리!
*/

import java.util.Scanner;

public class Test2_A {
	public static void main(String[] args) {
		int srp = (int)(Math.random() * 3) + 1; //시스템 저장 값 (1~3 사이값)
		System.out.println("가위(1), 바위(2), 보(3) 를 숫자로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int mySrp = scan.nextInt();
		boolean userwin = false;
		System.out.print("시스템:" + srp + ",사용자:" + mySrp);
		if (mySrp == srp) 
			System.out.println("\t비김.");
		else { //승부판단
			switch(srp) { //시스템 값
			case 1 : //가위
				if(mySrp == 2) userwin = true; break; //주먹
			case 2 : //주먹
				if(mySrp == 3) userwin = true; break; //보
			case 3 : //보
				if(mySrp == 1) userwin = true; break; //가위
			}
			if (userwin) //userwin == true
				System.out.println(" \t사용자 승리!");
			else
				System.out.println(" \t시스템 승리!");
		}
	}
}