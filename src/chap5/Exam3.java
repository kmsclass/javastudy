package chap5;
/*
 * str 문자열 내에 각 소문자의 갯수를 출력하기
 * 1. 소문자의 갯수만 조회
 * 2. 갯수가 1이상인 데이터만 출력하기
 * 3. 갯수만큼 * 출력하기
 * [결과]
 * a:4개=>****
 * b:3개=>***
 * d:3개=>***
 * ....
 */
public class Exam3 {
	public static void main(String[] args) {
		String str = "aaabbb123ssstttuuuaaaqqqzzzzzzzzz";
		int[] cnt = new int[26];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				cnt[ch-'a']++;
			}
		}
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]>0) {
				System.out.print((char)('a'+i)+":"+cnt[i] +"개=>");
				for(int j=0;j<cnt[i];j++) {
					System.out.print("*"); 
				}
				System.out.println();
			}
		}
	}
}
