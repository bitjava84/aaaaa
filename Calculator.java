package test2;

public class Calculator {
	
	public String BMI(int hight,double weight){

		double result;

		result = (weight / ((hight - 100) * 0.9)) * 100;

		if (result >= 120) {
			return "��";
		} else if (result >= 110) {
			return "��ü��";
		} else if (result >= 90) {
			return "����";
		} else 
			return "��ü��";
	}
}
