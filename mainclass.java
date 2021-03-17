class VarArg{
	public static void set(int...ar){
		for(int data:ar){
			System.out.println(data);
		}
	}
}
class MainClass{
	public static void main(String...ar){
		VarArg.set(12,34,33,45,66,77);
	}
}