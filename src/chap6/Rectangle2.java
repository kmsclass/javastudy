package chap6;

/*
 * Rectangle2 클래스
 *  멤버변수 : width(가로), height(세로),sno(사각형생성번호),cnt(생성번호를 위한 static변수)
 *  멤버메서드 : area() : 넓이 값 리턴
 *             length() : 둘레값 리턴
 *             isSquare() : 정사각형 여부를 boolean 타입으로 리턴
 *             toString() : 사각형정보출력
 */
public class Rectangle2 {
	int width,height,sno;
	static int cnt;
	int area() {
		return width*height;
	}
	int length() {
		return (width + height) * 2;
	}
	boolean isSquare() {
		return width == height;
	}
	public String toString() {
		return sno+"번사각형=>(" + width + "," + height+"),넓이:"+area() + 
				",둘레:"+length() + ","+(isSquare()?"정사각형":"직사각형") + 
				",생성된 사각형 갯수:"+cnt;
	}
}
