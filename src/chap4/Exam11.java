package chap4;

public class Exam11 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.print(i+"단\t");
		}
		System.out.println();
		System.out.println("2단\t3단\t4단\t5단\t6단\t7단\t8단\t9단");
		System.out.println();
		for(int j=2;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
