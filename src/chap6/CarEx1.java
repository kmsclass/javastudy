package chap6;
/*
 * 선언 위치에 따른 변수의 종류
 *                 선언위치    선언방법             메모리할당시점    메모리할당위치
 *  - 클래스변수     클래스내부   static 자료형 변수명  클래스정보로드시   클래스영역
 *             => 객체화 필요없음. 모든객체의 공통변수로 사용됨
 *             => 클래스명.변수명
 *             => 기본값으로 초기화
 *  - 인스턴스변수    클래스내부          자료형 변수명  객체화시         힙영역
 *             => 객체화 필요. 객체별로 다른 메모리 할당됨
 *             => 참조변수명.변수명
 *             => 기본값으로 초기화
 *  - 지역변수       메서드내부   자료형 변수명         선언문실행시      스택영역
 *             => 메서드, 블럭내에서만 사용가능
 *             => 기본값으로 초기화 안됨. 반드시 초기화 필요함
 *             => 매개변수는 지역변수
 */
class Car {
	 String color;   //인스턴스변수(객체변수)
	 int number;     //인스턴스변수(객체변수)
	 static int width = 200;  //클래스변수
	 static int height = 120; //클래스변수
	 public String toString() {
		 return color + ":" + number + "("+width+","+height+")";
	 }
}
public class CarEx1 {
	public static void main(String[] args) { //args :지역변수 
		System.out.println(Car.width + "," + Car.height);
//		System.out.println(Car.color + "," + Car.number);
		Car c1 = new Car();   //c1 지역변수
		c1.color="White";
		c1.number = 1234;
		System.out.println("c1:"+c1.toString());
		Car c2 = new Car();   //c2 지역변수 
		c2.color = "Red";
		c2.number = 5678;
		System.out.println("c2:"+c2.toString());
		Car.width=80; //c1.width = 80;
		Car.height=50; //c1.height = 50;		
		System.out.println("c1:"+c1.toString());
		System.out.println("c2:"+c2.toString());
		
		int num=0;  //지역변수는 초기화 필요
		System.out.println(num);
		int i;
		boolean b = true;
		if (b) {
			i=10;
		} else {
			i=20;
		}
		System.out.println(i); //10
		int j,k;
		j=1;
		switch(j) {
		  case 1 :  k = 10;
		  case 2 :  k = 20;
		  default : k = 0;
		}
		System.out.println(k);
	}
}
