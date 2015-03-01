package net.franklinps.chivallati.Lab13;

import java.util.ArrayList;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankC extends BankBranch
{

	private ArrayList< BankAccount > bankAccounts;
	private int totalMoney;


	public BankC( )
	{

		super( "Medway", "Dean Bank of Medway" );

	}

	public int getNumAccounts( ) { return bankAccounts.size(); }

	public void setTotalMoney( )
	{

		for ( int i = 0 ; i < bankAccounts.size() ; i++ )
		{

			totalMoney += bankAccounts.get( i ).getBalance();

		}

	}

	public double getTotalMoney( ) { return totalMoney; }

	protected void addAccount( ) {

		//add accounts to the data base specific to bankC

	}

	public ArrayList< BankAccount > getBankAccounts() { return bankAccounts; }

	private void setBankAccounts( ) {

		//read the accounts database file for bankC and add the BankAccount objects into a dynamic array

	}

}