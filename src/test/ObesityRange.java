package test;

import java.util.Scanner;

public class ObesityRange
{
    public static void main(String[] args)
    {
        System.out.println("�񸸵�  ����");
        
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Ű �Է�");
        int k = sc.nextInt();
        
        System.out.println("������ �Է�");
        double m = sc.nextDouble();
 
        double result = 0;
        result = (m / ((k-100) * 0.9))*100;
        
        System.out.printf("�Է¹��� Ű : %d, ������ : %f \n", k,m);
        System.out.println("����� �񸸵��� : " + (int)result + "%");
        
        if(result>=120)
        {
            System.out.println("��");
        }
        else if(result>=110)
        {
            System.out.println("��ü��");
        }
        else if(result>=90)
        {
            System.out.println("����");
        }
        else if(result<90)
        {
            System.out.println("��ü��");
        }
    }
}



