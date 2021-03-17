import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import static java.lang.System.out;
class IOConcept{
	static public void main(String ar[])throws Exception{
		out.println("Enter data : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		
		//FileWriter fw = new FileWriter("file.txt",true);
		//true will open or write in append mode
		FileWriter fw = new FileWriter("file.txt");
		fw.write(str);
		fw.close();
		
		FileReader fr = new FileReader("file.txt");
		BufferedReader br1 = new BufferedReader(fr);
		String output = br1.readLine();
		out.println(output);
	}
}