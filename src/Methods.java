
public class Methods {

	private AddressBook address;

	public Methods(AddressBook address) {
		super();
		this.address = address;
	}

	public PersonContact AssumeData(PersonContact contact) {

		address.add(contact);

		return contact;
	}
	public PersonContact addContact(PersonContact contact) {

		address.add(contact);

		return contact;
	}

	public PersonContact deleteContact(int index) {
		PersonContact oldValue = address.get(index);
		address.remove(index);
		return oldValue;
	}

	public PersonContact getContact(int index) {
		
		return address.get(index);
	}

}
