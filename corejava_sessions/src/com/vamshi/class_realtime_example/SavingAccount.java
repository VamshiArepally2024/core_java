package com.vamshi.class_realtime_example;

//this is the class
public class SavingAccount {
	// this is the state
	long acc_number;
	String acc_holder_name;
	double bal;
	String ifsc_code;
	String branch;

	// setters are used to set the values
	// getters are used to getting the values
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

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
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

	// this is the method which is used to expose the behaviour
	public void accountInfo() {
		System.out.println("acc_num:" + acc_number);
		System.out.println("acc_holder_name:" + acc_holder_name);
		System.out.println("avail_bal:" + bal);
		System.out.println("ifsc_code:" + ifsc_code);
		System.out.println("branch:" + branch);

	}

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
		// with the help of refernce variable ,we setted values succesffully
		savingAccount.setAcc_number(1000008866l);
		savingAccount.setAcc_holder_name("vamshi_arepally");
		savingAccount.setBal(50000.0d);
		savingAccount.setIfsc_code("MTPL4538ITD");
		savingAccount.setBranch("Mtpl");

		savingAccount.accountInfo();

	}

}
