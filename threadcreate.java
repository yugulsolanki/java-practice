//Creating thread
class NewThread extends Thread{
	String name;
	NewThread(String name){
		this.name=name;
		start();
	}
	public void run(){
		Operations.get(name);
	}
	
}
class Operations{
	static void get(String nm){
		System.out.println(nm+" started");
		try{
			Thread.sleep(200);
		}
		catch(InterruptedException ex){}
	}
}

class Main{
	static public void main(String ar[])throws Exception{
		NewThread t1 = new NewThread("first thread");
		t1.join();
		NewThread t2 = new NewThread("Second thread");
	}
}