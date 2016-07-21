package test;

import java.util.Scanner;

public class ObesityRange
{
    public static void main(String[] args)
    {
        System.out.println("비만도  계산기");
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("키 입력");
        int k = sc.nextInt();
        
        System.out.println("몸무게 입력");
        double m = sc.nextDouble();
 
        double result = 0;
        result = (m / ((k-100) * 0.9))*100;
        
        System.out.printf("입력받은 키 : %d, 몸무게 : %f \n", k,m);
        System.out.println("당신의 비만도는 : " + (int)result + "%");
        
        if(result>=120)
        {
            System.out.println("비만");
        }
        else if(result>=110)
        {
            System.out.println("과체중");
        }
        else if(result>=90)
        {
            System.out.println("정상");
        }
        else if(result<90)
        {
            System.out.println("저체중");
        }
    }
}



