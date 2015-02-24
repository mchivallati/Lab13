package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/23/2015. This is a test
 */
public class LabRunner
{

	public static void main( String[] args )
	{

		BankAccount me = new BankAccount( 100.00 , "Chivallati" , "Matthew" );
		System.out.println( me.toString() );
		me.deposit( 29.45 );
		System.out.println( me.toString() );
		me.withdraw( 29.45 );
		System.out.println( me.toString() );



	}

}