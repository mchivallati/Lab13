package net.franklinps.chivallati.Lab13;

/**
 * Created by CompSci-04 on 2/24/2015.
 */
public class Util
{

	public static int randomInt( int min, int max ) //generates a random number
	{

		int range = max - min; //used to control the maximum value the random method outputs

		int randomNum = (int) ( ( Math.random( ) * range ) + min ); // generates the random value between the min and max value that were passed into the formal param

		return randomNum; //returns the value generated to randomNum( int min , int max )

	}

}