import java.util.Scanner;
import static java.lang.System.out;
class CityBus{
	public static void main(String...ar){
		Scanner sc=new Scanner(System.in);
		boolean condition = true;
		while(condition){
			out.println("				*****Welcome***** ");
			out.println("1.To know fair charge for your source to destination.");
			out.println("2.To know Bus_no as per route.");
			out.println("3.to know route names as per Bus_no");
			out.println("4.To know card making charges as per category.");
			out.println("5.To exit.");
			out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					out.println("=================================================");
					out.println("PLease enter source, destination and km.");
					String source = sc.next();
					String destination = sc.next();
					float km = sc.nextFloat();
					out.println("Charges from "+source+" to "+destination+" is :"+km*2+"Rs");
					out.println();
					break;
				case 2:
					out.println("=================================================");
					out.println("Enter route to get bus no.: ");
					String route = sc.next(); 
					if(route.equals("ringroad")){
						out.println("Bus_no for "+route+" are :"+ "1,2,3,4,5" );
					}
					else if(route.equals("abroad")){
						out.println("Bus_no for "+route+" are :"+ "6,7,8,9,10");
					}
					else if(route.equals("rajwada")){
						out.println("Bus_no for "+route+" are :"+ "11,12,13");
					}
					out.println();
					break;
				case 3:
					out.println("=================================================");
					out.println("Enter bus_no to know its route :");
					int busNo = sc.nextInt();
					if(busNo==1 || busNo==2 || busNo==3 || busNo==4 || busNo==5){
						out.println("RindRoad");
					}
					else if(busNo==6 || busNo==7 || busNo==8 || busNo==9 || busNo==10){
						out.println("AB Road");
					}
					else if(busNo==11 || busNo==12 || busNo==13){
						out.println("Rajwada");
					}
					out.println();
					break;
				case 4:
					out.println("=================================================");
					out.println("		Card Making charges		");
					out.println(" 200Rs/month for student.");
					out.println(" 160Rs/month for senior citizens.");
					out.println(" 300Rs/month for others.");
					out.println();
					break;
				case 5:
					condition = false;
				
			}
		}
	}
}