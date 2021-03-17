abstract class Shape{
	abstract void volume();
	abstract void show();
}
class Cone extends Shape{
	float r = 5;
	float h = 10;
	double v;
	void volume(){
		System.out.println("radius is 5 and height of cone is 10");
		v = 3.14*r*r*h/3;
	}
	void show(){
		System.out.println("volume of cone "+v);
	}
}
class Cylinder extends Shape{
		float radius=5;
		float height=9;
		double v;
	void volume(){
		System.out.println("radiusis 5 and height of cylinder is 9");
		v = 3.14*radius*radius*height;
	}
	void show(){
		System.out.println("volume of cylinder: "+ v);
	}
}
class Sphere extends Shape{
		float rad = 6;
		double v;
	void volume(){
		System.out.println("radius of sphere is 6");
		v = 4*3.14*rad*rad/3;
	}
	void show(){
		System.out.println("volume of sphere: "+v);
	}
}
class MainClass{
	public static void main(String ar[]){
		Shape ref1 = new Cone();
		ref1.volume();
		ref1.show();
		Shape ref2 = new Cylinder();
		ref2.volume();
		ref2.show();
		Shape ref3 = new Sphere();
		ref3.volume();
		ref3.show();
	}
}
