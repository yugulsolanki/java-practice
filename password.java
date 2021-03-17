//Runtime class : this is used to get os internal commands
import java.util.Scanner;
import static java.lang.System.out;
class Password{
	public static void main(String ag[])throws Exception{
		Scanner sc = new Scanner(System.in);
		out.println("enter password to continue..");
		String password = sc.next();
		if(password == "Abc123"){
			out.println("Correct password");
		}
		else{
			out.println("invalid password");
			Runtime run = Runtime.getRuntime();
			run.exec("c:/windows/system32/rundll32.exe user32.dll LockWorkStation");
			//unreported IOexception is thrown towards JRE of JDK, by throws keyword
			//run.exec("shutdown -s");
			//run.exec("shudowm -s -t 60");
			
		}
	}
}




