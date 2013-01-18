public class RunningNumberSum {  // Save as "RunningNumberSum.java"
   public static void main(String[] args) {
      int lowerbound = 1;      // Store the lowerbound
      int upperbound = 1000;   // Store the upperbound
      int product = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a for-loop to repeatitively sum from the lowerbound to the upperbound
      for (int number = 0; number <= upperbound; number+=7) {
         product = product + number;   // Accumulate number into sum
      } 
      // Print the result
      System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
   }
}