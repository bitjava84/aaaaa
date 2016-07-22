package test;

public class Ex_For {

	public static void main(String args[]) {

		for (int i = 0; i < 11; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println("-------------------------------------1");

		for (int i = 10; i >= 0; i--) {
			System.out.println("i의 값 : " + i);
		}
		System.out.println("-------------------------------------2");

		int count, sum = 0;

		for (count = 1; count <= 100; count++)

			sum += count;

		System.out.println("1에서 100까지의 합은 " + sum + "입니다.");

		System.out.println("-------------------------------------3");

		for (int i = 0; i < 3; i++) {
			System.out.println("변수 i의 값 : " + i);
			for (int j = 0; j < 3; j++)
				System.out.println("***변수 j의 값 : " + j);

		}

		System.out.println("-------------------------------------4");

		
		for(int a=0; a<=7; a++){
			for(int b=0; b<=7; b++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------5");
		
		for (int i = 0; i <= 9; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("-------------------------------------6");

		for(int c=0; c<=9; c++){
			for(int d=c; d<=9; d++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("-------------------------------------7");
		
		int num = 10;

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}
	
		System.out.println("-------------------------------------8");
		for (int i = num; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i * 2 - 1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("-------------------------------------9");

		
			}
		}
	