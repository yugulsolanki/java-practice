class Company{
	String cmpName;
	String services;
	void set(String cmpName, String services){
		this.cmpName=cmpName;
		this.services=services;
	}
	void show(){
		System.out.println("---------Parent Class---------");	
		System.out.println(cmpName+" "+ services);	
	}
}
class Employee extends Company{
	String empName;
	String post;
	void set(String empName, String post){
		super.set("Infosys","abcxyz");
		this.empName=empName;
		this.post=post;
	}
	void show(){
		super.show();
		System.out.println("------Child class-------");
		System.out.println(empName+" "+post);
	}
}
class Inheritance{
	public static void main(String ar[]){
		Employee emp = new Employee();
		emp.set("yugul","Manager");
		emp.show();
	}
}