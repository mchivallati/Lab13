package net.franklinps.chivallati.Lab13;

import java.util.ArrayList;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankC extends BankBranch
{

	private ArrayList<BankAccount> bankAccounts = new ArrayList();
	private int totalMoney;


	public BankC( )
	{

		super( "Medway", "Dean Bank of Medway" );
		setBankAccounts();
		setTotalMoney();

	}

	public int getNumAccounts( ) { return bankAccounts.size(); }

	public void setTotalMoney( )
	{

		for ( BankAccount bankAccount : bankAccounts ) {

			totalMoney += bankAccount.getBalance();

		}

	}

	public double getTotalMoney( ) { return totalMoney; }

	protected void addAccount( ) {

		//add account to the data base specific to bankC

	}

	protected void removeAccount()
	{

		//remove an account from the data base specific to bankC
		
	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts()
	{

		BankAccount john = new BankAccount( "John" , "Smith" , 9887 );
		BankAccount yaBoiMit = new BankAccount( "Mit" , "Romney" , 6545 );

		bankAccounts.add(john);
		bankAccounts.add(yaBoiMit);

	}

	public void displayBank()
	{

		System.out.println( "BankC Location: " + location + " | BankC Name: " + branchName );
		System.out.println( "Bank Accounts" );
		System.out.println();

		for ( BankAccount bankAccount : bankAccounts ) {

			System.out.println( bankAccount.toString() );

		}

	}

}