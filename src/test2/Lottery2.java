package test2;

class Lottery2 {

	public static void main(String[] args) {
		int Lottery[] = new int[6];

		for (int i = 0; i < Lottery.length; i++) {
			Lottery[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (Lottery[i] == Lottery[j]) {
					i--;
					break;

				}
			}
		}

		for (int i = 0; i < Lottery.length; i++) {
			System.out.print(Lottery[i] + " ");
		}
	}
}
