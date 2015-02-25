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
		// we need to figure out a way to add bank accounts dynamically to a branch
		
		
	}

	public int getNumAccounts()
	{
		
		return bankAccounts.size();
		
	}
	public void setTotalMoney()
	{
		
		for ( int i = 0 ; i < bankAccounts.size() ; i++ )
		{
			
			totalMoney += bankAccounts.get(i).getBalance();
			
		}
		
	}
	
	public double getTotalMoney()
	{
		
		return totalMoney;
		
	}
	
}