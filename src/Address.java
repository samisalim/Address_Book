
public class Address {
	private String Street, City, State, Zip;

	public Address(String street, String city, String state, String zip) {
		super();
		Street = street;
		City = city;
		State = state;
		Zip = zip;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}

	@Override
	public String toString() {
		return Street + " " + City + " " + State + " " + Zip;
	}

}
