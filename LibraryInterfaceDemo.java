package Abstraction;


interface LibraryUser{
	void registerAccount();
	void requestBook();
}

class KidUser implements LibraryUser{
	
	 int age;
	 String bookType;
	
	public KidUser(int age,String bookType) {
		this.age=age;
		this.bookType=bookType;
	}
	
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered \r\n"
					+ "under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to \r\n"
					+ "register as a kid");
		}
		
	}
	public void requestBook() {
		if(this.bookType.equals("Kids")) {
			System.out.println("Book Issued Successfully");
			
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
	
}

class AdultUser implements LibraryUser{

	int age;
    String bookType;

	public AdultUser(int age,String bookType) {
		this.age=age;
		this.bookType=bookType;
	}

	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
		
	}

	public void requestBook() {
		if(this.bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}
	
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount(); // Expected output: "You have successfully registered under a Kids Account"
        kidUser1.requestBook(); // Expected output: "Book Issued successfully, please return the book within 10 days"

        KidUser kidUser2 = new KidUser(18, "Fiction");
        kidUser2.registerAccount(); // Expected output: "Sorry, Age must be less than 12 to register as a kid"
        kidUser2.requestBook();

        AdultUser adultUser1 = new AdultUser(5, "Kids");
        adultUser1.registerAccount(); // Expected output: "Sorry, Age must be greater than 12 to register as an adult"
        adultUser1.requestBook();

        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser2.registerAccount(); // Expected output: "You have successfully registered under an Adult Account"
        adultUser2.requestBook(); // Expected output: "Book Issued successfully, please return the book within 7 days"

	}

}
