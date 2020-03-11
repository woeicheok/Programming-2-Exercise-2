import java.util.*;
public class PrintReverse
{
   public static void main (String [] args)
   {
   Scanner sc = new Scanner(System.in);
   
   String wordreverse = "";
   
   System.out.println("Enter a sentences: ");
   String sentences = sc.next();
      for (int i=sentences.length()-1; i>=0; i--)
         wordreverse = wordreverse + sentences.charAt(i);
         System.out.println("Reverse of this string: " + wordreverse);
             
    }
}