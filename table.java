import java.util.Scanner;

class Table{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=10;i++){
			int c = i*a;
			System.out.println(a+" x "+i+" = "+c);
		}
	}
}