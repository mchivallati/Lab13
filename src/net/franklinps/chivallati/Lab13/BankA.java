package net.franklinps.chivallati.Lab13;

import java.util.ArrayList;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankA extends BankBranch
{
	
	private ArrayList<BankAccount> bankAccounts;
	private int totalMoney;
	
	
	public BankA()
	{
		
		super( "Franklin" , "Dean Bank of Franklin" );
		
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

		//add account to the data base specific to bankA

	}

	protected void removeAccount()
	{

		//remove an account from the data base specific to bankA

	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts()
	{
		
		//read the accounts database file for bankA and add the BankAccount objects into a dynamic array
		
	}
	
}