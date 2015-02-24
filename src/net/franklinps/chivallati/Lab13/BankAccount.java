package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public class BankAccount implements AccountsInterface
{

	private double balance;
	private long accountID;
	private String name;

	public BankAccount()
	{

		balance = 0;
		setAccountID();
		name = "";

	}

	public BankAccount( double balance , String firstName , String lastName )
	{

		this.balance = balance;
		setAccountID();
		setName( firstName , lastName );

	}

	public double getBalance() { return balance; }

	public void deposit( double amount )
	{

		this.balance += amount;

	}

	public void withdraw( double amount )
	{

		this.balance -= amount;

	}

	private void setAccountID()
	{

		accountID = Util.randomInt( 10000 , 10000000 );

	}

	private void setName( String firstName , String lastName )
	{

		name = lastName + ", " + firstName;

	}

	public String toString()
	{

		return "[ " + "$" + ( Math.round( balance * 100.0 ) / 100.0 ) + ", " + accountID + ", " + name + " ]";

	}

}
