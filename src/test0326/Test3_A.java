package test0326;

/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오

[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/

public class Test3_A {
	public static void main(String[] args) {
		 Card card1 = new Card();  //객체화
		 card1.kind = "Heart";
		 card1.number = 1;
	     System.out.println(card1); //toString() 멤버 메서드 호출
		 Card card2 = new Card();
		 card2.kind = "Spade";
		 card2.number = 1;
	     System.out.println(card2);
	     Card.width = 50;
	     Card.height = 80;
	     System.out.println(card1);
	     System.out.println(card2);		
		
	}
}