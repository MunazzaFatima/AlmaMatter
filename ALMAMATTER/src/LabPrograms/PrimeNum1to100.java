package LabPrograms;

import java.util.Scanner;

public class PrimeNum1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,count=0;
System.out.println("ënter n value:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("prime numbers between 1 to "+ n+ "are:");
for(int j=2;j<=n;j++)
{
	count=0;
	for(int i=1;i<=j;i++)
	{
		if(j%i==0)
		{
			count++;
		}
	}

if(count==2)
{
	System.out.println("prime num is:"+j);
}

	}

}
}