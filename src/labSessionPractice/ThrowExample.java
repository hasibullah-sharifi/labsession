package labSessionPractice;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="johmithdkjflsd";
		if(password.length()>9) {
			System.out.println("your password is good");
			
		}
		else {
			throw new RuntimeException(" yourpassword should be more than 8 characters");
		}
        // note i used to the keyword :throw :to throw a exeption if the your password
	   // is less than 8 character the program will throw an exception using throw key word
		
	}

}
