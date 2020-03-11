import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class RandomLnRange
{
   public static void main(String[]args)
   {
   Scanner in = new Scanner(System.in);
   int numOne, numTwo;
   int count = 0;
   
   System.out.println("Enter the first number: ");
   numOne = in.nextInt();
   System.out.println("Enter the second number: ");
   numTwo = in.nextInt();
   
   if(numOne>numTwo)
   {
   System.out.println(count);
   }
      else{
         count = ThreadLocalRandom.current().nextInt(numOne-1, numTwo+1);
         System.out.println("The random integer is: " + count);
         }
    }
}
  