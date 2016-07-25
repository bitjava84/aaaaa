package test2;

public class MaxMin {

	public static void main(String[] args) {
		int[] number = { 79, -88, 91, 100, 33, -55, 95 };

		int max = number[0];
		int min = number[0];

		for (int loop = 1; loop < number.length; loop++) {
			if (number[loop] > max)
				max = number[loop];
			if (number[loop] < min)
				min = number[loop];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
