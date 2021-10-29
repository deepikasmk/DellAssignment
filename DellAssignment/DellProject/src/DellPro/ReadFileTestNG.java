package DellPro;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.testng.annotations.*;


public class ReadFileTestNG {
	ReadFile RF=new ReadFile();

	AssignmentMethods AS=new AssignmentMethods();
	 //positive test - assert largest word returned with hardcoded expected value
	   @Test
	   public void testFindBigWord() throws FileNotFoundException {
		   String expectedOutput = "Pennsylvania";
		   String actualOutput = AS.largestWord("C:\\temp\\testfile.txt");
		   assertEquals(expectedOutput, actualOutput);
	   }
	   
	   
	   //negative test - assert empty input file and compare with empty expected value
	   @Test
	   public void testEmptyInputFile() throws FileNotFoundException {
		   String expectedOutput = "";
		   String actualOutput = AS.largestWord("C:\\temp\\testfileEmpty.txt");
		   assertEquals(expectedOutput, actualOutput);
	   }
	   
	
}
