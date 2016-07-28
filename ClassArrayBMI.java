package test2;

import java.util.Scanner;

class Person{

	private String name;
	private int height; 
	private double weight; 
	private String result;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
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


public class ClassArrayBMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person person = new Person();
		Calculator cal = new Calculator();

		System.out.println("이름 입력");
		person.setName(sc.nextLine());

		System.out.println("키 입력");
		person.setHeight(sc.nextInt());

		System.out.println("몸무게 입력");
		person.setWeight(sc.nextDouble()); 

		String result = cal.BMI(person.getHeight(), person.getWeight());
		person.setResult(result);

		System.out.println(person.toString());
	}

}
