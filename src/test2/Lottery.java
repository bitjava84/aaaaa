package test2;

import java.util.Random;

public class Lottery {

	public static void main(String[] args) {	
		Lottery lotto = new Lottery();
		lotto.lotto();
		
	}
	public void lotto(){ 
		Random random = new Random();		
		boolean equal = false; 
		int Lottery[] = new int[6];
		int temp;
		int i=0;
		while(i<6){
			temp = 1+random.nextInt(45);
			for(int j=0; j<i; j++){
				if(Lottery[j] == temp){ 
					equal = true; 
					break;
				}
			}
			if(equal == true){
				equal = false;
				continue;
			}		
			Lottery[i] = temp;
			i++;
		}
		
		print(Lottery);
	}

	public void print(int[] p){ 
		for(int j=0;j<6;j++){
			if(j==5) System.out.print(p[j]);
			else System.out.print(p[j]+"\t");
		}
		System.out.println();
	}
}
