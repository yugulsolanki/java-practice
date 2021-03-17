import static java.lang.System.out;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
class DateLogic{
	public static void main(String ag[]){
		Date date = new Date();
		out.println(date);
		//or
		out.println(new Date());
		
		//by SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy  hh:mm:ss");
		out.println(sdf.format(date));
		
		//by DateFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		out.println(df.format(date));
		//FULL : Friday, 5 February, 2021
		//LONG :5 February, 2021
		//SHORT :
		//MEDIUM : 05-Feb-2021
	}
}