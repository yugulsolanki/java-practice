import java.util.Scanner;
class Volume{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius and height of cone : ");
		float r = sc.nextFloat();
		float h = sc.nextFloat();
		double v = 3.14*r*r*h/3;
		System.out.println("Volume of cone : "+ v);		
		System.out.println("Enter radius and height of cylinder : ");
		float radius = sc.nextFloat();
		float height = sc.nextFloat();
		v = 3.14*radius*radius*height;
		System.out.println("volume of cone : "+ v);
		System.out.println("Enter radius of sphere : ");
		float rad = sc.nextFloat();
		v = 4*3.14*rad*rad/3;
		System.out.println("volume of sphere is : "+ v);
	}
}