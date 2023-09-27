package labSessionPractice;

public class TypeOFErros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String name="hasib" => it is compile error because missing semicoln
		// logical error 2-2=4
		//we can handle exception by try and catch 
		// try- mean first run this block of code
		// catch- if there is an exception in try block run code inside catch block
		// note- and also in the begening of catch block we also indentify the excepiton
		//"finally"= finally is a block of code that will always execute regardless of exception
		double num=10;
		double n=8;
		double result;
		System.out.println("we are trying to divide to numbers");
		
		try {
			result=num/n;System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("an Excerption happend "+e.getMessage());
		}

		
		System.out.println("we divided to numbers");
	
		
	

}}
