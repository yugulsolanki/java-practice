import static java.lang.System.out;
class StrLogic{
	public static void main(String...ar){
		String str1 = "indore city";
		out.println(str1.toUpperCase());
		
		String str2 = "BHOPAL CITY";
		out.println(str2.toLowerCase());
		
		String str3 = "hello how are you";
		out.println(str3.replace('h','H'));
		
		String st4 = "   honesty is best policy";
		out.println(st4);
		out.println(st4.trim());//to remove RHS and LHS space
		//out.println(st4.startWith("   hon"));//will give boolean value true/false
		out.println(st4.endsWith("licy"));//will give boolean value true/false
		
		String str5 = "yugul solanki";
		out.println(str5.indexOf('g'));
		out.println(str5.charAt(4));
		
		String str6 = "java";
		String str7 = "code";
		out.println(str6.concat(str7));
	}
}


