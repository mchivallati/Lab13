package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/23/2015. This is a test
 */
public class LabRunner
{

	public static void main( String[] args )
	{

		System.out.println("Concrete Bank Branches");
		System.out.println();

		BankA a = new BankA();
		System.out.println( "BankA Total Money $" +  a.getTotalMoney() );
		a.displayBank();
		System.out.println();

		BankB b = new BankB();
		System.out.println( "BankB Total Money $" + b.getTotalMoney() );
		b.displayBank();
		System.out.println();

		BankC c = new BankC();
		System.out.println( "BankC Total Money $" + c.getTotalMoney() );
		c.displayBank();
		System.out.println();

		System.out.println("Bank Account Example");
		System.out.println();

		BankAccount nick = new BankAccount( "Nick" , "NoName" , 8765 );
		nick.deposit( 2300.54 );
		System.out.println("Nick Deposits $2300.54");
		System.out.println( nick.toString() );
		nick.withdraw( 345.68 );
		System.out.println("Nick Withdraws $345.68");
		System.out.println( nick.toString() );

	}

}