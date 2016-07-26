package test2;

import java.util.Scanner;

public class ModifyArrayBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hight = new int[5];
		double[] weight = new double[5];
		double[] result = new double[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("키 입력");
			hight[i] = sc.nextInt();

			System.out.println("몸무게 입력");
			weight[i] = sc.nextDouble();

		}

		for (int i = 0; i < 5; i++) {
			result[i] = (weight[i] / ((hight[i] - 100) * 0.9)) * 100;

			System.out.println("당신의 비만도는 : " + (int) result[i] + "%");

			if (result[i] >= 120) {
				System.out.println("비만");
			} else if (result[i] >= 110) {
				System.out.println("과체중");
			} else if (result[i] >= 90) {
				System.out.println("정상");
			} else if (result[i] < 90) {
				System.out.println("저체중");
			}
		}
	}

}
