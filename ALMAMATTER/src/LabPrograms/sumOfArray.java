package LabPrograms;

public class sumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0;
     int array[]= {20,30,40,50,60};
      //advanced for loop
     for(int num:array)
     {
    	 sum=sum+num;
     }
     System.out.println("sum of num"+sum);
	}

}
