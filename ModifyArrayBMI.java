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

			System.out.println("Ű �Է�");
			hight[i] = sc.nextInt();

			System.out.println("������ �Է�");
			weight[i] = sc.nextDouble();

		}

		for (int i = 0; i < 5; i++) {
			result[i] = (weight[i] / ((hight[i] - 100) * 0.9)) * 100;

			System.out.println("����� �񸸵��� : " + (int) result[i] + "%");

			if (result[i] >= 120) {
				System.out.println("��");
			} else if (result[i] >= 110) {
				System.out.println("��ü��");
			} else if (result[i] >= 90) {
				System.out.println("����");
			} else if (result[i] < 90) {
				System.out.println("��ü��");
			}
		}
	}

}
