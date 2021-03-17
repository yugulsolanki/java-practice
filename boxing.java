class Autoboxing{
	public static void main(String ar[]){
		int num1 = 1010;
		Integer ref1 = num1;	//boxing:when we have to use OOPs features
		System.out.println(ref1);
		
		Integer ref2 = 143333;
		int num2 = ref2;	//unboxing : when we need higher range >(0-127)
		System.out.println(num2);
		
		Integer ref3 = 143333;
		int num3 = ref3;
		
		//if(ref2==ref3){//same for range btw 0-127
		// so fro higher range we should use .equals() method
		if(ref2.equals(ref3)){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}
		
	}
}