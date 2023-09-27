package labSessionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerWithExceoption {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try{ System.out.println("enter a number");
		double a =scan.nextDouble();
		System.out.println("enter second number");
		
		double b=scan.nextDouble();
		//handling
		
		double result =a/b;
		System.out.println("result is "+result);
		}catch (InputMismatchException e) {
			System.out.println("you can put numbers only");

			System.out.println(e.getMessage());
		}catch (ArithmeticException e ) {
			System.out.println("you can divid a number by zero");
			System.out.println(e.getMessage());
			// TODO: handle exception
		
		}
		finally{
			System.out.println("you run the code seccessfully");
			
		}
		scan.close();
		// note : we can identify two or more exception in  in one catch block
		// catch(ArithmeticException | InputMistmatchException e){
		//}
		// note : instead of identify too many exception we can just go with family
		// like catch(RunTimeExeption){}

	
	}

}
