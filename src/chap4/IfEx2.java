package chap4;
/*
 * 중첩 if 구문 : if 문 내에 if 문이 존재
 */
public class IfEx2 {
	public static void main(String[] args) {
		int score = 49;
		if(score >= 60) {
			System.out.println("합격입니다.");
			if(score>=80) {
				System.out.println("좋은 성적입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
			if (score < 50) {
				System.out.println("더욱 노력하세요");
			}
		}
	}
}
