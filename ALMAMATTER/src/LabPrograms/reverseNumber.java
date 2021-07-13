package LabPrograms;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,reversenum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
         num=scan.nextInt();
        while(num!=0)
        {
        	reversenum=reversenum*10;
        	reversenum=reversenum+num%10;
        	num=num/10;
        }
        System.out.println("reverse of a number"+reversenum);
	}

}
