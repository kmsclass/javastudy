package chap6;
/* 구동 클래스를 실행시 다음과 같은 결과가 나오도록 Rectangle3클래스 구현하기 
 * Rectangle3 클래스
 *  멤버변수 : width(가로), height(세로),sno(사각형생성번호),cnt(생성번호를 위한 static변수)
 *  생성자  : 구동클래스에 맞도록 구현
 *  멤버메서드 : area() : 넓이 값 리턴
 *             length() : 둘레값 리턴
 *             isSquare() : 정사각형 여부를 boolean 타입으로 리턴
 *             toString() : 사각형정보출력
 * [결과]
 * 1번사각형=>(10,20),넓이:200,둘레:60,직사각형,생성된 사각형 갯수:1
 */
class Rectangle3 {
	int width, height,sno;
	static int cnt;
	Rectangle3(int w, int h){
		width = w;
		height = h;
//		sno = ++cnt;
	}
	int area() {
		return width * height;
	}
	int length() {
		return (width + height)*2;
	}
	boolean isSquare() {
		return width==height;
	}
	//1번사각형=>(10,20),넓이:200,둘레:60,직사각형,생성된 사각형 갯수:1
	public String toString() {
		return sno + "번사각형=>("+width+","+height+"),넓이:"+area() +
				",둘레:"+length()+","+(isSquare()?"정사각형":"직사각형") +
				",생성된 사각형 갯수:"+cnt;
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Rectangle3 r = new Rectangle3(10,20);
		System.out.println(r);
		Rectangle3 r2 = new Rectangle3(20,20);
		System.out.println(r2);
	}
}
