package test2;

import java.util.Scanner;

class Person{

	private String name;
	private double height; 
	private double weight; 
	private String result;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result2) {
		this.result = result2;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", result=" + result + "]";
	}
}

class Assign{

	public String BMI(double hight,double weight){

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

public class ClassArrayBMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person person = new Person();
		Assign assign = new Assign();

		System.out.println("�̸� �Է�");
		person.setName(sc.nextLine());

		System.out.println("Ű �Է�");
		person.setHeight(sc.nextInt());

		System.out.println("������ �Է�");
		person.setWeight(sc.nextDouble()); 

		String result = assign.BMI(person.getHeight(), person.getWeight());
		person.setResult(result);

		System.out.println(person.toString());
	}

}
