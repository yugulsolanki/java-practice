class College{
	String collName;
	String address;
	String city;
	long contact;
	void set(String collName, String address, String city, long contact){
		this.collName=collName;
		this.address=address;
		this.city=city;
		this.contact=contact;
	}
	void show(){
		System.out.println(collName+" "+address+" "+city+" "+contact);
	}
}

class MainClass{
	public static void main(String ar[]){
		College coll = new College();
		coll.show();
		coll.set("IIPS","itpark","indore",1234567);
		coll.show();
	}
}