package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/23/2015.
 */
public interface AccountsInterface
{

	public double getBalance();

	public void deposit( double amount );

	public void withdraw( double amount );

	public String toString();

}