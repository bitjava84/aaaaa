package test2;

public class Calculator {
	
	public String BMI(int hight,double weight){

		double result;

		result = (weight / ((hight - 100) * 0.9)) * 100;

		if (result >= 120) {
			return "비만";
		} else if (result >= 110) {
			return "과체중";
		} else if (result >= 90) {
			return "정상";
		} else 
			return "저체중";
	}
}
