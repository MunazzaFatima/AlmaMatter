package LabPrograms;

import java.util.Scanner;

public class areaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner scan=new Scanner(System.in);
                System.out.println("ENTER THE RADIUS");
                float radius=scan.nextFloat();
                double area=Math.PI*(radius*radius);
                System.out.println("area of circle"+area);
                double circumference=2*Math.PI*radius;
                System.out.println("circumference is "+circumference);
	}

}
