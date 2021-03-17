import java.util.Scanner;
class Area{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		float radius = sc.nextFloat();
		double area = 3.14*radius*radius;
		System.out.println("Area of circle : "+ area+"sq");		
		System.out.println("Enter base and height of right angle triangle : ");
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		area = .5*height*base;
		System.out.println("Area of triange : "+ area+"sq");
		System.out.println("Enter length and breadth of rectangle : ");
		float length = sc.nextFloat();
		float breadth = sc.nextFloat();
		area = length*breadth;
		System.out.println("Area of rectangle : "+ area+"sq");
	}
}