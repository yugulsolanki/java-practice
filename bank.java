class Bank{
	int t_amount, c_amount, w_amount;
	int credit(int amt, int c_amt){
		c_amount = c_amt;
		t_amount = amt;
		t_amount = t_amount + c_amount;
		return t_amount;
	}
	int withdraw(){
		w_amount = w_amt;
		t_amount = t_amount - w_amount;
		return t_amount;
	}
}
class main{
	public static void main(String arg[]){
		Bank b = new Bank();
		b.credit(5000, 100);
		b.withdraw(1000);
		b.credit(500);
		//Sysytem.out.println();
	}
}	
