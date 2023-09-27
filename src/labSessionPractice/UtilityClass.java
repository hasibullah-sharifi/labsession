package labSessionPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class UtilityClass {
	public static double doDivision(double first, double second) throws ArithmeticException{
		return first/second;
	}
	public static void readFile(String file) throws FileNotFoundException {
		InputStream Stream = new FileInputStream(new File(file));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
