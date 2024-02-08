package com.vamshi.object_realtime_example;

//this is the class 
public class CurrentAccount {
	// these are the state/property values
	long acc_id;
	long acc_number;
	String acc_holder_name;
	double balance;
	String ifsc_code;
	String branch;

	// setters are used to set the values
	// getters are used to get the values
	public long getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(long acc_id) {
		this.acc_id = acc_id;
	}

	public long getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}

	public String getAcc_holder_name() {
		return acc_holder_name;
	}

	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static void main(String[] args) {
		// here object is created with the help of new keyword
		// it is refered by an reference variable called "currentAccount"
		// new keyword is used to allocate the memory in the heap area to store the
		// object
		// currentAccount reference variable is used to store the object address

		CurrentAccount currentAccount = new CurrentAccount();

		// now we have to set the values to the object of CurrentClass

		currentAccount.setAcc_id(100000011);
		currentAccount.setAcc_number(8899900022l);
		currentAccount.setBalance(2000000.0d);
		currentAccount.setIfsc_code("CBI78678MTPL");
		currentAccount.setBranch("MTPL");
		
		//we are going the get the values of an object of class 
		
		System.out.println("ACCOUNT_ID:"+currentAccount.getAcc_id());
		System.out.println("ACCOUNT_NUMBER:"+currentAccount.getAcc_number());
		System.out.println("ACCOUNT_HOLDER_NAME:"+currentAccount.acc_holder_name);
		System.out.println("ACCOUNT_BALANCE:"+currentAccount.getBalance());
		System.out.println("IFSC_CODE:"+currentAccount.getIfsc_code());
		System.out.println("BRANCH:"+currentAccount.getBranch());

	}

}
