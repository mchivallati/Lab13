package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public abstract class BankBranch implements Bank
{

	protected String location;
	protected String branchName;

	public BankBranch()
	{

		location = "";
		branchName = "";
		
		// create a data base for bank accounts when a Bank Branch is created

	}

	public BankBranch( String location , String branchName )
	{

		this.location = location;
		this.branchName = branchName;

	}

	public String getLocation() { return this.location; }

	public String getBranchName() { return this.branchName; }
	
	protected abstract void addAccount();
	
	protected abstract void removeAccount();

}