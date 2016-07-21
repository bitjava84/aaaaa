package ngolo_kante13;

public class PostfixOp_Reus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=7;
		int num2, num3;
		
		num2 = num1++; //num1은 8이 되긴 하는데...
		num3 = num1--; //num1이 다시 7이된긴 하는데...
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
