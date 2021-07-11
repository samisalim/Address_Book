
import java.util.Scanner;

public class Address_Book_Main {

	public static void main(String[] args) {
		int input = 0;

		Scanner sc = new Scanner(System.in);

		Name a = new Name("Bill", "Smith");
		Address b = new Address("123 Main St", "Coolsville", "MD", "20876");
		Phone c = new Phone("301-555-1234");
		AddressBook s = new AddressBook();
		PersonContact Bill = new PersonContact(a, b, c);
		Methods control = new Methods(s);
		control.AssumeData(Bill);

		Name d = new Name("Sally", "Jones");
		Address e = new Address("1 Here DR", "Rockville", "MD", "1111");
		Phone f = new Phone("240-888-3400");
		PersonContact Sally = new PersonContact(d, e, f);
		control.AssumeData(Sally);

		Name g = new Name("Mohammad", "Smith");
		Address h = new Address("333 Elm St", "Largo", "MD", "21726");
		Phone i = new Phone("240-777-9999");
		PersonContact Mohammad = new PersonContact(g, h, i);
		control.AssumeData(Mohammad);
		s.display();
		do {
			System.out.println("\nPlease select on the options below:" + "\n 1. Add a contact to the addres book"
					+ "\n 2. Delete a contact from the address book" + "\n 3. Update a contact from the address book"
					+ "\n 4. Display the Address book" + "\n 5. Exit the application");

			input = sc.nextInt();
			sc.nextLine();

			switch (input) {

			case 1: {
				System.out.println("Please enter the first name");
				String F_Name = sc.nextLine();
				System.out.println("Please enter the Last name");
				String L_Name = sc.nextLine();
				Name j = new Name(F_Name, L_Name);

				System.out.println("Please enter the street's name and number");
				String Street = sc.nextLine();
				System.out.println("Please enter the city");
				String city = sc.nextLine();
				System.out.println("Please enter the State");
				String State = sc.nextLine();
				System.out.println("Please enter the Zip");
				String zip = sc.nextLine();
				Address k = new Address(Street, city, State, zip);

				System.out.println("Please enter the Phone number");
				String phone = sc.nextLine();
				Phone L = new Phone(phone);

				PersonContact Hello = new PersonContact(j, k, L);
				control.addContact(Hello);
				s.display();

				break;
			}
			case 2: {
				System.out.println("Please enter the index you want to delete");
				int index = sc.nextInt();
				control.deleteContact(index - 1);
				s.display();
				break;
			}

			case 3: {
				System.out.println("Please enter the index you want to update");
				int index = sc.nextInt();

				PersonContact p = control.getContact(index - 1);
				System.out.println("Do you want change the first name?(Y/N)");
				sc.nextLine();
				char YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new first name");
					sc.nextLine();
					String F_Name = sc.nextLine();
					p.getName().setF_Name(F_Name);

				} else {
					System.out.println(" ");
				}
				System.out.println("Do you want to change the last name?(Y/N)");

				YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new LAST name");
					sc.nextLine();
					String L_Name = sc.nextLine();
					p.getName().setL_Name(L_Name);
				} else {
					System.out.println(" ");
				}
				System.out.println("Do you want to updat the street's address? (Y/N)");

				YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new street's address");
					sc.nextLine();
					String Street = sc.nextLine();
					p.getAddress().setStreet(Street);
				} else {
					System.out.println(" ");
				}

				System.out.println("Do you want to updat the city int the address? (Y/N)");

				YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new city in the address");
					sc.nextLine();
					String city = sc.nextLine();
					p.getAddress().setCity(city);
				} else {
					System.out.println(" ");
				}

				System.out.println("Do you want to updat the state in the address? (Y/N)");

				YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new state in the address");
					sc.nextLine();
					String state = sc.nextLine();
					p.getAddress().setState(state);
				} else {
					System.out.println(" ");
				}

				System.out.println("Do you want to updat the Zip in the address? (Y/N)");

				YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new Zip in the address");
					sc.nextLine();
					String zip = sc.next();
					p.getAddress().setZip(zip);
				} else {
					System.out.println(" ");
				}

				System.out.println("Do you want to updat the phone number? (Y/N)");

				YesOrNo = sc.next().charAt(0);
				if (YesOrNo == 'Y' || YesOrNo == 'y') {
					System.out.println("Please enter the new phone number");
					String phone = sc.next();
					p.getPhone().setPhone(phone);
				} else {
					System.out.println(" ");
				}
				s.display();
				break;
			}
			case 4: {
				s.display();

				break;
			}
			case 5: {

				break;
			}
			}

		} while (input != 5);
		sc.close();
	}

}
