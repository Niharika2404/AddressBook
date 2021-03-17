import java.util.Scanner;

public class AdderssBook {
	
	private static void contactDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Contac Details of a person: ");
		String firstName = sc.nextLine();
		System.out.println("Enter the First Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter the Last Name: ");
		String address = sc.nextLine();
		System.out.println("Enter the Address: ");
		String city = sc.nextLine();
		System.out.println("Enter the City: ");
		String state = sc.nextLine();
		System.out.println("Enter the State: ");
		int zip = sc.nextInt();
		System.out.println("Enter the ZipCode: ");
		int phoneNumber = sc.nextInt();
		System.out.println("Enter the PhoneNumber: ");
		String email = sc.nextLine();
		System.out.println("Enter the EmailID: ");
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome To The Address Book Program!!");
		contactDetails();
	}

}
