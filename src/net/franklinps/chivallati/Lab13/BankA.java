package net.franklinps.chivallati.Lab13;

import java.util.ArrayList;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankA extends BankBranch
{
	
	private ArrayList<BankAccount> bankAccounts = new ArrayList();
	private int totalMoney;
	
	
	public BankA()
	{
		
		super( "Franklin" , "Dean Bank of Franklin" );
		setBankAccounts();
		setTotalMoney();
		
	}

	public int getNumAccounts() { return bankAccounts.size(); }
	
	public void setTotalMoney()
	{

		for ( BankAccount bankAccount : bankAccounts ) {

			totalMoney += bankAccount.getBalance();

		}
		
	}
	
	public double getTotalMoney() { return totalMoney; }

	protected void addAccount()
	{

		//add account to the data base specific to bankA

	}

	protected void removeAccount()
	{

		//remove an account from the data base specific to bankA

	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts()
	{

		BankAccount me = new BankAccount( "Matthew" , "Chivallati" , 1234 );
		BankAccount tyler = new BankAccount( "Tyler" , "Jonhson" , 4321 );

		bankAccounts.add(me);
		bankAccounts.add(tyler);
		
	}

	public void displayBank()
	{

		System.out.println( "BankA Location: " + location + " | BankA Name: " + branchName );
		System.out.println( "Bank Accounts" );
		System.out.println();

		for ( BankAccount bankAccount : bankAccounts ) {

			System.out.println( bankAccount.toString() );

		}

	}
	
}