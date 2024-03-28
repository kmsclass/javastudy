package test0327;
/*
 * Test2.java 소스의 Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.
 * [결과]
 * myCoin	youCoin
 * 앞면	앞면
 * 뒷면	앞면
 * 앞면	뒷면
 * 뒷면	앞면
 * 뒷면	앞면
 * 앞면	앞면
 * youCoin 승리  
 */

public class Test5_A {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int mycnt=0,youcnt=0;
		System.out.println("myCoin\tyouCoin");
		while(mycnt < 3 && youcnt < 3) {
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side == 0) mycnt++;
			else mycnt=0;
			if(youCoin.side == 0) youcnt++;
			else youcnt=0;
			System.out.println
			((myCoin.side==0?"앞면":"뒷면")+"\t"+(youCoin.side==0?"앞면":"뒷면"));
		}
		//mycnt 또는 youcnt 값이 둘,또는 하나는 3인 경우
		if(mycnt == youcnt) System.out.println("비김");
		else if (mycnt == 3)  System.out.println("myCoin 승리");
		else System.out.println("youCoin 승리");
	}
}
