import java.util.Scanner;

class AreaPerimeter{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		float r = sc.nextFloat();
		double area= 3.14*r*r;
		double perimeter = 2*3.14*r;
		System.out.println("area fo cirle : "+ area);
		System.out.println("perimeter fo cirle : "+ perimeter);
	}
}