
public class HarmonicSeriesSum 
{
	public static void main(String args[])
	{
		int numTerms = 1000;
		double sum = 0.0;
		for(double denom = 1; denom <= numTerms; denom++) // replace denom++ by denom*=2 for geometric series.
		{
			sum = sum + (1/denom); 
		}
		System.out.println("The Harmonic Series Sum of " + numTerms + " terms is: " + sum );
	}

}
