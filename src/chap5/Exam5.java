package chap5;
/*
 * arr 배열의 행과 열의 합 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{1,2,3,4,5},{10,20},{100}};
		int maxcol = 0;  //최대 열의 갯수 
		for(int i=0;i<arr.length;i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		int[] colsum = new int[maxcol]; //colsum.length:5
		for(int i=0;i<arr.length;i++) {
			int sum = 0; //행의 합 
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j]; //행의 합
				colsum[j] += arr[i][j]; //arr[1][2]				
			}
			System.out.println(i+"행의 합:"+sum);
			}
		for(int i=0;i<colsum.length;i++) {
			System.out.println(i+"열의 합:"+colsum[i]);
		}

	}
}
