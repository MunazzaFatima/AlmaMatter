package alma;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan=new Scanner(System.in);
            System.out.println("please enter i value:");
            int i=scan.nextInt();
            System.out.println("please enter j value:");
            int j=scan.nextInt();
            int sum=i+j;
            System.out.println("addition of i and j is:"+sum);
	}

}
