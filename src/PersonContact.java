
public class PersonContact {

	private Address address;
	private Name name;
	private Phone phone;

	public PersonContact(Name name, Address address, Phone phone) {

		this.address = address;
		this.name = name;
		this.phone = phone;

	}
	public PersonContact() {}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + " " + address+ " " + phone;
	}

}
