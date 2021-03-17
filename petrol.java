import java.util.Scanner;
class Petrol{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter avg of vehical :");
		float avg = sc.nextFloat();
		System.out.println("Enter per day consumption of petrol :");
		float usedPerDay = sc.nextFloat();
		System.out.println("Enter total petrol fill up :");
		float totalFilled = sc.nextFloat();
		float days = totalFilled/usedPerDay;
		System.out.println("no of days will last :"+ days);
	}
}