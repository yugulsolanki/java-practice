
//mainly used for testing the code
class Code{
	int var;
	void set(int var){
		this.var=var;
	}
	void show(){
		var = var*100;
		assert(var==1000):"Bug found";
		System.out.println(var);
	}
}
class Test{
	static public void main(String ar[]){
		Code ref = new Code();
		ref.set(1);
		ref.show();
	}
}