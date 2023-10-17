class DepartmentStore {
	private int acc_num;
	private int balance;
	private int total_items;
	private int total_credits;
	private int credit_limit;
	public int getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTotal_items() {
		return total_items;
	}
	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}
	public int getTotal_credits() {
		return total_credits;
	}
	public void setTotal_credits(int total_credits) {
		this.total_credits = total_credits;
	}
	public int getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	public DepartmentStore(int acc_num, int balance, int total_items, int total_credits, int credit_limit) {
		super();
		this.acc_num = acc_num;
		this.balance = balance;
		this.total_items = total_items;
		this.total_credits = total_credits;
		this.credit_limit = credit_limit;
	}
	
	public void CalculateBalance() {
		int final_balance = balance + total_items - total_credits;
		System.out.println("The New Balance is : " + final_balance);
		
		if(final_balance > balance) {
			System.out.println("Credit limit exceeded");
		}
	}
	
	
	
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentStore d1 = new DepartmentStore(123, 23000, 20000, 190000, 250000);
		
		d1.CalculateBalance();
		
	}

}
