package chap5;
/*
 * 2차원 배열 예제
 *  - 2차원 배열은 1차원 배열의 참조변수의 배열임
 *  - 다차원 배열은 배열의 배열로 표현됨
 */
public class ArrEx6 {
	public static void main(String[] args) {
		//2차원 배열의 선언과 생성
		int[] arr[] = new int[3][2]; //3행2열배열
		//초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("1차원 배열 객체 생성하기");
		int[] intarr = {1,2,3,4,5};
		arr[1] = intarr;
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		intarr[3] = 5000;
		System.out.println(arr[1][3]); //5000
		
	}
}
