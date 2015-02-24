package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public abstract class BankBranch
{

	protected String location;
	protected String branchName;

	public BankBranch()
	{

		location = "";
		branchName = "";

	}

	public BankBranch( String location , String branchName )
	{

		this.location = location;
		this.branchName = branchName;

	}

	protected String getLocation() { return this.location; }

	protected String getBranchName() { return this.branchName; }



}