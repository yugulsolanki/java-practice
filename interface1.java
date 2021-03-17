class A{
	void show(){
		System.out.println("Show A");
	}
}
interface B{
	abstract public void show1();
}
class C extends A implements B{
	public void show1(){
		super.show();
		System.out.println("SHOW B");
	}
	void show2(){
		System.out.println("Show C");
	}
}
class MainClass{
	public static void main(String ar[]){
		C ref = new C();
		ref.show();
		ref.show1();
		ref.show2();
	}
}