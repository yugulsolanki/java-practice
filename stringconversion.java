//conversion from String to char and char to string

import static java.lang.System.out;
class StrCon{
	public static void main(String...ar){
		//char to string		
		char ch[] = {'e','t','u','p'};
		String str = new String(ch);
		out.println(str.toUpperCase());
		
		//String to char array
		int COUNT=0;
		String str1 = "nagar nigam";
		int len = str1.length();
		char ch1[] = new char[len];
		for(int i=0;i<len;i++){
			ch1[i] = str1.charAt(i);
			if(ch1[i]=='a' || ch1[i]=='e' || ch1[i]=='i' || ch1[i]=='o' || ch1[i]=='u'){
				COUNT++;
			}
		}
		out.println("TOtal no of vowels : "+COUNT);
	}	
}		
//