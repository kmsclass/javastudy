package test0327;
/*
 * 원(Circle) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:100, 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle {
	int r,no;
	static int count;
	Circle(int a) {
		r = a;   //반지름 설정
		no = ++count; //원의 번호
	}
	double area() {
		return r*r * Math.PI;
	}
	double length() {
		return 2*r * Math.PI;
	}
	void scale(double m) {
		r *= m;  //r = (int)(r * m);
	}
	public String toString() {
//		return no + "번원 : 반지름:" +r + ",넓이:" + area() + ", 둘레:" + length(); 
		//String.format(형식화문자열) => String 형으로 리턴
		// System.out.printf(형식화문자열) 사용법이 동일
		return String.format("%d번원 : 반지름:%d,넓이:%,.2f,둘레:%,.2f",
				    no,r,area(),length()); 
	}
}
public class Test4_A {
	public static void main(String[] args) {
		Circle[] carr=new Circle[3];
		carr[0] = new Circle(100); 
		carr[1] = new Circle(10);
		carr[2] = new Circle(1);
		for(Circle c : carr) {
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}
