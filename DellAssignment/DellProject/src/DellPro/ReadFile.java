package DellPro;

import java.io.*;
import java.io.File;



public class ReadFile {
	
	 public static String filelocation="C:\\temp\\testfile.txt";
	
   public static void main(String[] args) throws Exception
   {
	   
	   AssignmentMethods AM =new AssignmentMethods();
	// File path is passed as parameter
       File file = new File(filelocation);

       // Creating an object of BuffferedReader class
       BufferedReader br = new BufferedReader(new FileReader(file));

       // Declaring a string variable
       String st;
       
       System.out.println("Given words in the file");
       System.out.println("****************************");
       while ((st = br.readLine()) != null)

           // Print the string
    	   
           System.out.println(st);
          
       br.close();
  
       System.out.println("\n");
       System.out.println("Largest word in given file");
       System.out.println("****************************");
       String LWord=AM.largestWord(filelocation);
       System.out.println(LWord);
       
       System.out.println("\n");
       System.out.println("Transpose Largest word using buildin methods");
       System.out.println("****************************");
       String TransPoseWord=LWord.replaceAll(LWord.substring(0,LWord.length()-3),LWord.substring(1,LWord.length()-1));
       System.out.println(TransPoseWord);
      
       System.out.println("\n");
       System.out.println("Transpose Largest word without build in method");
       System.out.println("****************************");
       AM.transpose(LWord);
       
       
       
        
       System.out.println("\n");
       System.out.println("the largest word and the largest word transposed ");
       System.out.println("****************************");
       System.out.println(LWord);
       System.out.println(TransPoseWord);
    
   }
   
	
           
}



   

   

