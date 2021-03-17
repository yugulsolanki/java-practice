import java.util.Scanner;
class Avg{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float avg = (a+b+c)/3;
		System.out.println("avarage of three number : " + avg);
	}
}