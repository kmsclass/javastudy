package chap6;
/*
 * 구동클래스를 실행 했을때 결과가 출력되도록 EastCard 구현하기
 * EastCard 
 *  멤버변수 : int number, boolean isKwang
 *  생성자   : 구동클래스에 맞도록 구현 
 *  멤버메서드 : toString() : 결과가 나오도록 구현
 *  
 *  [결과]
 *  3   => number:3, isKwang : false
 *  1K  => number:1, isKwang : true
 */
class EastCard {
	int number;
	boolean isKwang;
	EastCard(int number,boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	EastCard(){
		this(1,true);
	}
	public String toString() {
		return number + (isKwang?"K":"");
	}
}
public class Exam3 {
	public static void main(String[] args) {
		EastCard card1 = new EastCard(3,false);
		EastCard card2 = new EastCard();
		System.out.println(card1);  //3
		System.out.println(card2);  //1K
	}
}
