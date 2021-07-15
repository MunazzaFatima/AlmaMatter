package LabPrograms;

public class primeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0,num=97;
for(int i=1;i<=num;i++)
{
	if(num%i==0)
	{
		count++;
	}
	i++;
	
}
if(count==2)
{
	System.out.println("ït is  a prime number");
	
}else
{
	System.out.println("it is not a prime number");
}
	}

}
