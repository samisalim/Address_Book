
public class Name {
	private String F_Name, L_Name;

	public Name(String f_Name, String l_Name) {
		super();
		F_Name = f_Name;
		L_Name = l_Name;
	}

	public String getF_Name() {
		return F_Name;
	}

	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}

	public String getL_Name() {
		return L_Name;
	}

	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}

	@Override
	public String toString() {
		return F_Name + " " + L_Name;
	}

}
