import java.util.*;
public class CountA
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        
        System.out.println("Enter a sentences: ");
        String sentences = in.next();
        for(int i=0; i<sentences.length(); i++){
           if(sentences.charAt(i) == 'A'){
             count++;
             }
             }
             System.out.println("The total of A in this sentences: " + count);
            
     }
}