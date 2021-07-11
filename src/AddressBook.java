import java.util.ArrayList;

public class AddressBook {
	ArrayList<PersonContact> contact = new ArrayList<>();

	public AddressBook() {
		super();
	}

	public PersonContact add(PersonContact contacts) {
		contact.add(contacts);
		return contacts;
	}

	public PersonContact remove(int index) {
		PersonContact oldValue = contact.get(index);
		contact.remove(index);
		return oldValue;
	}

	public PersonContact get(int index) {
		return contact.get(index);
	}

	public void display() {
		int i = 1;
		System.out.println("Index\tFull Name\t\tFull Address       \t\tPhone Number\n"
				+ "*******************************************************************************");
		for (PersonContact c : contact)
			System.out.printf("%5d\t%-20s\t%-40s\n", i++, c.getName().toString(),
					c.getAddress() + " " + " " + c.getPhone().toString());
	}
}
