import java.util.StringJoiner;
class StringOp{
	public static void main(String ar[]){
		StringBuffer sb = new StringBuffer("indore");
		//StringBuilder sb = new.StringBuilder("indore");
		sb.reverse();//on same location - mutable
		sb.append("city");
		sb.delete(2,5);
		sb.insert(5,"^%$#");//from 5th index this string ll be added
		System.out.println(sb);
		
		String str1 = "YUGUL";
		str1.toLowerCase();//on diff location-immutable
		System.out.println(str1); //YUGUL coz location is same and we have changed it
							//on different location
		System.out.println(str1.toLowerCase());
		
		StringJoiner ref = new StringJoiner(",");
		ref.add("my ");
		ref.add("name ");
		ref.add("is ");
		ref.add("yugul solanki");
		System.out.println(ref);
	}
}
// for stringBuilder and stringBuffer we do not need to specify the location
//coz they are in same package with class Object with are in lang. 
//class StringOp{ extends java.lang.Object