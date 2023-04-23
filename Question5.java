import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner scanner = new Scanner(System.in);
    // Prompt the user for the number of integers
        int n = scanner.nextInt();

        // Get the integers from the user
        int[] integers = new int[n];
        for (int i = 0; i < n; i++) 
        {           
            integers[i] = scanner.nextInt();
        }

        // Find the mode
        int mode = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) 
            {
                if (integers[j] == integers[i]) 
                {
                    count++;
                }
            }
            //update maxCount if frequency is higher than previous
            if (count > maxCount) 
            {
                maxCount = count;
                mode = integers[i];
            }
        }

        // Print the mode
        System.out.println(mode);
    
  }
}
