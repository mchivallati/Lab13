package net.franklinps.chivallati.Lab13;

import java.util.ArrayList;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankB extends BankBranch
{

	private ArrayList<BankAccount> bankAccounts = new ArrayList();
	private int totalMoney;


	public BankB()
	{

		super( "Wrentham" , "Dean Bank of Wrentham" );
		setBankAccounts();
		setTotalMoney();

	}

	public int getNumAccounts() { return bankAccounts.size(); }
	public void setTotalMoney()
	{

		for ( int i = 0 ; i < bankAccounts.size() ; i++ )
		{

			totalMoney += bankAccounts.get(i).getBalance();

		}

	}

	public double getTotalMoney() { return totalMoney; }

	protected void addAccount()
	{

		//add an account to the data base specific to bankB

	}

	protected void removeAccount()
	{

		//remove account from the data base specific to banB

	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts()
	{

		BankAccount joe = new BankAccount( "Joe" , "Shmo" , 2345 );
		BankAccount obama = new BankAccount( "Barrack" , "Obama" , 8765 );

		bankAccounts.add(joe);
		bankAccounts.add(obama);

	}

	public void displayBank()
	{

		System.out.println( "BankB Location: " + location + " | BankB Name: " + branchName );
		System.out.println( "Bank Accounts" );
		System.out.println();

		for ( BankAccount bankAccount : bankAccounts ) {

			System.out.println( bankAccount.toString() );

		}

	}

}