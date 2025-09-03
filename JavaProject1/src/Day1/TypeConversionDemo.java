package Day1;

public class TypeConversionDemo {
	public static void main(String[] args) {
		
		//Implicit Conversion
		byte num1=127;
		int num2=num1;
		System.out.println(num2);
		
		//Explicit Conversion
		int num3=200;
		byte num4=(byte)num3;
		System.out.println(num4);
	}
}
