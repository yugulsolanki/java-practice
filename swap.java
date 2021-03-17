import java.util.Scanner;
class Swap{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swaping : " + "a = "+a+" and b = "+b);
	}
}