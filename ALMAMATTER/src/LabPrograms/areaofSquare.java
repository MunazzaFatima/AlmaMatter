package LabPrograms;

import java.util.Scanner;

public class areaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("enter the sides of square");
         
         float s=scan.nextFloat();
         double area=4*s;
         System.out.println("area of square"+area);
	}

}
