package labSessionPractice;

import java.io.FileNotFoundException;

public class ThrowsExampleTesting extends UtilityClass{

	public static void main(String[] args) {
		UtilityClass.doDivision(0, 0);
		
		// when use readFile function you have handle the exception because we
		// used throws in the decleartion of the readFile method
		// that why i used try and catch in this mehtod
		try {
			UtilityClass.readFile("fghj");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println();
			
			System.out.println(e.getMessage());
		}
		

	}

	

}
