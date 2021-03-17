//Forming methods
//1.Sting class
//2.NumberFormat class
//3.SimpleDateFormat class
//4.DateFormat class
import static java.lang.System.out;
import java.text.NumberFormat;
class Formating{
	public static void main(String ar[]){
		int radius = 2;
		double area = 3.14*radius*radius;
		//by String class
		String output = String.format("%2f", area);
		out.println(output);
		
		//by NumberFormat
		NumberFormat nf = NumberFormat.getNumberInstance();
		//nf.setMaximumFractionDigit(2);
		out.println(nf.format(area));
	}
}