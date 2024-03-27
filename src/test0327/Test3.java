package test0327;
/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal 클래스를 구현하기
[결과]
원숭이:26살
*/

public class Test3 {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		a1.info();
	}
}
