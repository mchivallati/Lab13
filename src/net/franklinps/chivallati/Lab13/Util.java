package net.franklinps.chivallati.Lab13;

import java.security.MessageDigest;
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
	
	public static String SHA256( String input ){
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(input.getBytes("UTF-8"));
		StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
	}

}