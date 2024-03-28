package chap6;
/*
 * this 예약어
 * 
 * this() 생성자 : 클래스 내부의 생성자에서 다른 생성자 호출시 사용되는 예약어
 *                생성자의 첫줄에 구현해야함.
 * this 참조변수 : 자기참조변수
 *   - 현재 객체의 참조값을 저장함. 
 *   - 인스턴스 메서드에서만 사용이 가능함 => 인스턴스 메서드 내부에 지역변수로 선언됨.
 *   - 지역변수와 멤버변수의 같은 이름을 가진 경우 구분시 사용함                 
 */
class Car4{
	String color;
	int number;
	int sno;
	static int width = 200;
	static int height = 120;
	static int cnt;
	Car4(String color, int number) {
		this.color = color;
		this.number = number;
		sno = ++cnt;
		System.out.println("(String c, int n) 생성자 호출");
	}
	Car4(String color) {
		this(color,1000); //Car4(String c, int n) 생성자 호출
		System.out.println("(String c) 생성자 호출");
	}
	Car4(int number) {
		this("White",number);//Car4(String c, int n) 생성자 호출
		System.out.println("(int n) 생성자 호출");
	}
    public String toString() {
    	return this.sno + "번 자동차:"+this.color + "," + this.number + 
    			 "(" + Car4.width+","+Car4.height + ")";
    }
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car4 c1 = new Car4("White",1234);
		System.out.println(c1);
		Car4 c2 = new Car4("Black");
		System.out.println(c2);
		Car4 c3 = new Car4(2000);
		System.out.println(c3);
	}
}
