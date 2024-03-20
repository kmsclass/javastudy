package chap4;
/*
 * 임의의 수 1~3을 선택하여 가위바위보 중 한개 출력하기
 * 
 *  1:가위
 *  2:바위
 *  3:보
 */
public class Exam3 {
	public static void main(String[] args) {
		int crp = (int)(Math.random() *3) + 1;
		/*
		 * 0 <= x < 1.0
		 * 0 <= x * 3< 3.0
		 * 0 <= (int)(x * 3)<= 2
		 * 1 <= (int)(x * 3)+1<= 3
		 */
		System.out.print(crp + ":");
		switch(crp) {
		case 1 : System.out.println("가위");break;
		case 2 : System.out.println("바위");break;
		case 3 : System.out.println("보");break;
	    }
	}
}
