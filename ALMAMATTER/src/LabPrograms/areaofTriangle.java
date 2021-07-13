package LabPrograms;

import java.util.Scanner;

public class areaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scan=new Scanner(System.in);
            System.out.println("enter the base");
            float base=scan.nextFloat();
            System.out.println("enter the height");
            float height=scan.nextFloat();
            double area=(base*height)/2;
            System.out.println("area of triangle"+area);
	}

}
