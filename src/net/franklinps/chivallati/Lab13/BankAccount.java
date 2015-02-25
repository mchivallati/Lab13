package net.franklinps.chivallati.Lab13;


import java.io.*;
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

		try(
			      InputStream file = new FileInputStream(lastName + ", " + firstName + ".account");
			      InputStream buffer = new BufferedInputStream(file);
			      ObjectInput input = new ObjectInputStream (buffer);
			    ){
			      String[] recoveredAccount = (String[])input.readObject();
					this.balance = Double.parseDouble(recoveredAccount[1]);
					accountID = Long.valueOf(recoveredAccount[0]);
					setName( firstName , lastName );
			    }
			    catch(Throwable ex){ // Catches all possible exceptions, which will then assume account is new and will be created below.
					this.balance = balance; 
					setAccountID();
					setName( firstName , lastName );
					saveAccount();
			    }
	}

	public double getBalance() { return balance; }

	public void deposit( double amount )
	{

		this.balance += amount;
		saveAccount();
	}

	public void withdraw( double amount )
	{

		this.balance -= amount;
		saveAccount();
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
	
	private void saveAccount()
	{
		String[] accountData = new String[3];
		accountData[0] = Long.toString(accountID);
		accountData[1] = Double.toString(balance);
		accountData[2] = name;
		 try (
			      OutputStream file = new FileOutputStream(name + ".account");
			      OutputStream buffer = new BufferedOutputStream(file);
			      ObjectOutput output = new ObjectOutputStream(buffer);
			    ){
			      output.writeObject(accountData);
			    }  
			    catch(IOException ex){
			      System.out.println("Couldn't save file!");
			    }
	}

}
