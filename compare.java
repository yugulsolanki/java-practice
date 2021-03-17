import java.util.Scanner;
class Compare{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b){
			System.out.println(a+" > "+b);
		}
		if(b>a){
			System.out.println(a+" < "+b);
		}
		if(a!=b){
			System.out.println(a+" != "+b);
		}
	}
}