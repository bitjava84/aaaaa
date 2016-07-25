package test2;

import java.util.Scanner;

public class ArrayBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] hight = new double[5] ;
		double[] weight = new double[5] ;
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++){
			
			System.out.println("키 입력");
			 hight[i] = sc.nextDouble();
			
			System.out.println("몸무게 입력");
			 weight[i] = sc.nextDouble();
			
		}
		

		double result = 0;

		for (int i = 0; i < 5; i++) {
			result = (weight[i] / ((hight[i] - 100) * 0.9)) * 100;

			System.out.println("당신의 비만도는 : " + (int) result + "%");

			if (result >= 120) {
				System.out.println("비만");
			} else if (result >= 110) {
				System.out.println("과체중");
			} else if (result >= 90) {
				System.out.println("정상");
			} else if (result < 90) {
				System.out.println("저체중");
			}
		}
	}

}
