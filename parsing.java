//Command line argument with pasing technique
import static java.lang.System.out;
class Parsing{
	public static void main(String ar[]){
		byte first = Byte.parseByte(ar[0]);
		short second = Short.parseShort(ar[1]);
		long third = Long.parseLong(ar[2]);
		int fourth = Integer.parseInt(ar[3]);
		float fifth = Float.parseFloat(ar[4]);
		double sixth = Double.parseDouble(ar[5]);
		boolean seventh = Boolean.parseBoolean(ar[6]);
		String eighth = ar[7];
		out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "+eighth);
	}
}