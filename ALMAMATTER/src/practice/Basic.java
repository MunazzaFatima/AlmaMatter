package practice;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner scan=new Scanner(System.in);
              System.out.println("please enter a value:");
              int a=scan.nextInt();
              System.out.println("please enter b value:");
              int b=scan.nextInt();
              System.out.println("please enter c value:");
              int c=scan.nextInt();
              int sum=(a*b)+c;
              System.out.println("value of expression is:"+sum);
              
	}

}
