

package student;

import java.util.Scanner;

// Author:Justin
// added command for Fetch+merge
// added command for Fetch+merge again

public class ReverseWord {
    public static void main(String[] args)
    {
     Scanner kb = new Scanner(System.in);
             System.out.println("Please enter a single word");
             String word = kb.nextLine();
             
             char[] myLetters = new char[word.length()];
             
             for(int i = 0; i <myLetters.length; i++)
             {
                 
             myLetters[i] = word.charAt(i);
             System.out.println(myLetters[i]);
                 
             }
             System.out.println();
             for(int i= myLetters.length -1; i>=0; i--)
             {
             
                 System.out.print(myLetters[i]);
             
             }   
              
             
             
             
        
        /* char[] myArray = new char[7];
        myArray[0] = 's';
        myArray[1] = 't';
        myArray[2] = 'u';
        myArray[3] = 'd';
        myArray[4] = 'e';
        myArray[5] = 'n';
        myArray[6] = 't';
        for(int i = 0; i <myArray.length; i++)
        {
        System.out.print(myArray[i]);
        */
        
        }
       
        
    
    } // end of main
    

 // end of class
