package test2;

import java.util.Scanner;

public class ArrayBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] hight = new double[5] ;
		double[] weight = new double[5] ;
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++){
			
			System.out.println("Ű �Է�");
			 hight[i] = sc.nextDouble();
			
			System.out.println("������ �Է�");
			 weight[i] = sc.nextDouble();
			
		}
		

		double result = 0;

		for (int i = 0; i < 5; i++) {
			result = (weight[i] / ((hight[i] - 100) * 0.9)) * 100;

			System.out.println("����� �񸸵��� : " + (int) result + "%");

			if (result >= 120) {
				System.out.println("��");
			} else if (result >= 110) {
				System.out.println("��ü��");
			} else if (result >= 90) {
				System.out.println("����");
			} else if (result < 90) {
				System.out.println("��ü��");
			}
		}
	}

}
