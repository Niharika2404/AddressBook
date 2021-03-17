import java.util.Scanner;

public class AdderssBook {
	
	private static void contactDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Contac Details of a person: ");
		System.out.println("Enter the First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter the Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter the Address: ");
		String address = sc.nextLine();
		System.out.println("Enter the City: ");
		String city = sc.nextLine();
		System.out.println("Enter the State: ");
		String state = sc.nextLine();
		System.out.println("Enter the ZipCode: ");
		int zip = sc.nextInt();
		System.out.println("Enter the PhoneNumber: ");
		int phoneNumber = sc.nextInt();
		System.out.println("Enter the Email: ");
		String email = sc.nextLine();
		
		
	}
	private class PersonAddress(String args[], int PhoneNumber , int ZipCode) {
		public void PersonAddress() {
			this.firstName = args[0];
			this.lastName = args[0];
			this.city = args[0];
			this.state = args[0];
			this.phoneNumber = phoneNumber;
			this.zipCode = zipCode;
		}
	
	
	private static void modify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Change FirstName (y/n)? ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			System.out.println("Enter the FirstName: ");
			String firstName = sc.nextLine();
			sc.nextLine();
		}
		
		System.out.println("Change LastName (y/n)? ");
		ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			System.out.println("Enter the LastName: ");
			String lastName = sc.nextLine();
			sc.nextLine();
		}
	
		System.out.println("Change State (y/n)? ");
		ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			System.out.println("Enter the State: ");
			String state = sc.nextLine();
			sc.nextLine();
		}
		
		System.out.println("Change City (y/n)? ");
		ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			System.out.println("Enter the City: ");
			String city = sc.nextLine();
			sc.nextLine();
		}
		
		System.out.println("Change email (y/n)? ");
		ch = sc.nextLine().charAt(0);
		if(ch == 'Y' || ch == 'y') {
			System.out.println("Enter the email: ");
			String email = sc.nextLine();
			sc.nextLine();
		}
		
		System.out.println("Change PhoneNumber (y/n)? ");
		ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			System.out.println("Enter the PhoneNumnber: ");
			int phoneNumber = sc.nextInt();
			sc.hasNextLine();
		}
		System.out.println("Change ZipCode (y/n)? ");
		ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			System.out.println("Enter the ZipCode: ");
			int zipCode = sc.nextInt();
			sc.hasNextLine();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To The Address Book Program!!");
		contactDetails();
		PersonAddress personaddress = new PersonAddress();
		personaddress.PersonAddress();
		
		modify();
	}
	
}
