package DellPro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssignmentMethods {
	 //public  String filelocation="C:\\temp\\testfile.txt";
	
	 public  String largestWord(String filelocation) throws FileNotFoundException 
     {
  	   String largest_word = "";
         String current;
         Scanner sc = new Scanner(new File(filelocation));


         while (sc.hasNext()) {
            current = sc.next();
             if (current.length() > largest_word.length()) {
          	   largest_word = current;
             }

         }
         sc.close();
           return largest_word;
     }
     
     
     
	
     public  void transpose( String Lword )
     {
         String tem = ""; 
         int end = Lword.length() - 1;


           for ( int i = 0; i < Lword.length()  / 2; i++ )
           {
          	 tem += Character.toString( Lword.charAt( i ) ) + Character.toString( Lword.charAt( end ) );
               end--;
           }
           // Lenth of String is odd
           if ( Lword.length() % 2 == 1 )
           {
               // add character in middle of String to the end of the new String
          	 tem+= Character.toString( Lword.charAt( Lword.length() / 2 ) );
           }

           System.out.println( tem );
     }
     


}
