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
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To The Address Book Program!!");
		contactDetails();
		PersonAddress personaddress = new PersonAddress();
		personaddress.PersonAddress();
	}

}
