abstract class A{
	abstract void show();
}
class B extends A{
	void show(){
		System.out.println("Show B");
	}
}
class C extends A{
	void show(){
		System.out.println("Show c");
	}
}
class MainClass{
	public static void main(String ar[]){
		A ref=new B();
		ref.show();
		A ref1=new C();
		ref1.show();
	}}