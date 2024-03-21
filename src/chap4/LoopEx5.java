package chap4;
/*
 * break   : switch,반복문 밖으로 제어 이동
 * continue: 반복문의 처음으로 제어 이동
 */
public class LoopEx5 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {  //i:3
			System.out.println("\n"+i+"단");  //2단
			for(int j=2;j<=9;j++) {   //j=6
//				if(j==5) break; //break 가 속한 반복문 종료
				if(j==5) continue;  
				System.out.println(i+"*"+j+"="+(i*j)); 
			}
		}
	}
}
