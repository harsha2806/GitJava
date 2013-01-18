
public class LeapYearCount {
	public static void main(String[] args) {
	      int lowerbound = 1;      // Store the lowerbound
	      int upperbound = 2010;   // Store the upperbound
	      for (int Year = lowerbound; Year <= upperbound; Year++) {
	         if (((Year%4==0) && (Year%100 !=0)) || (Year%400==0))
	        	 System.out.println(Year + " is a leap year");
	      } 
	   }


}
