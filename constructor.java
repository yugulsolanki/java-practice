class Const{
	Const(){
		System.out.println("default constructor called.");
	}
	Const(int a,int b){
		System.out.println("parameterised const. called");
	}
	Const(Const ref){
		System.out.println("copy const. called");
	}
}

class MainClass{
	public static void main(String ar[]){
		Const obj = new Const(new Const(new Const(10,20)));
	}
}