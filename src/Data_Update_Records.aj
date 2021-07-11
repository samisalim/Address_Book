import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public aspect Data_Update_Records {
	private PersonContact contact;
	pointcut addNEWCheck(): call (public PersonContact addContact(PersonContact));

	after() returning(PersonContact contact): addNEWCheck(){
		this.contact = contact;
		try (PrintWriter writer = new PrintWriter(new FileWriter("Data Record.txt", true))) {
			writer.println("Record Added: " + " " + contact);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	pointcut updateCheck(): call (public PersonContact getContact(int));
	
	after() returning (PersonContact contact): updateCheck(){
		try (PrintWriter writer = new PrintWriter(new FileWriter("Data Record.txt", true))) {
			writer.println("Record updated: " + " " + contact);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	pointcut deleteCheck(): call (public PersonContact deleteContact(int));
	
	after() returning (PersonContact oldValue): deleteCheck(){
		try (PrintWriter writer = new PrintWriter(new FileWriter("Data Record.txt", true))) {
			writer.println("Record Deleted: " + " " + oldValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
