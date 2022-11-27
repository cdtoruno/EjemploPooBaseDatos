package entidades;
/**
 * @author cdte
 * @version 1.0
 * @created 21-Nov-2022 11:05:21 PM
 */
public class Autor {

	private int authorID;
	private String firstName;
	private String lastName;

	public Autor(){

	}

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Autor(int authorID, String firstName, String lastName) {
        this.authorID = authorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Autor{" + "authorID=" + authorID + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

	
}