package net.franklinps.chivallati.Lab13;

import java.util.ArrayList;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankB extends BankBranch
{

	private ArrayList<BankAccount> bankAccounts;
	private int totalMoney;


	public BankB()
	{

		super( "Wrentham" , "Dean Bank of Wrentham" );

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

		//read the accounts database file for bankB and add the BankAccount objects into a dynamic array

	}

}