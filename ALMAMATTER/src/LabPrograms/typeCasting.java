package LabPrograms;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            byte b=10;
            int i=b;
            //byte c=i;  // will not accept because lower cannot be put in higher
            byte d=(byte)i;
            byte x=10;
            byte y=20;
            //byte sum=x*y; throws error when 2 bytes multiply it is an int not byte
            int sum =x*y;
	}

}
