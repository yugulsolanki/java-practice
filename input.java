import java.util.Scanner;

class Input{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = a*b;
		System.out.println(a+" * "+b+" = " + c);
	}
}