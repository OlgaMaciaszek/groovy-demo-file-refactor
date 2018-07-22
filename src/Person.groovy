import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */
public class Person {

	private String name;
	private String surname;
	private List<String> emails = new ArrayList<>();
	private Address address;
	private Integer netWorth;

	public Person() {
	}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, String surname, List<String> emails) {
		this(name, surname);
		this.emails = emails;
	}

	public Integer getNetWorth() {
		return netWorth != null ? netWorth : 0;
	}

	public void setNetWorth(Integer netWorth) {
		this.netWorth = netWorth;
	}

	public List<String> getEmails() {
		return emails;
	}

	public String getFullName() {
		return getFullName("Ms.");
	}

	public String getFullName(String prefix) {
		return prefix + " " + name + " " + surname;
	}

	public void addEmail(String email) {
		emails.add(email);
	}

	public String getCity() {
		if (address != null) {
			return address.getCity();
		}
		return null;
	}

	public void printFirstEmail() {
		System.out.print("Printing first email: ");
		if (emails.size() >= 1) {
			System.out.println(emails.get(0));
		} else {
			System.out.println("-");
		}
	}

	public boolean sameEmails(List<String> emails) {
		return this.emails.equals(emails);
	}

	@Override
	public String toString() {
		return "DemoClass{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", emails=" + emails +
				", address=" + address +
				", netWorth=" + netWorth +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return Objects.equals(name, person.name) &&
				Objects.equals(surname, person.surname) &&
				Objects.equals(emails, person.emails) &&
				Objects.equals(address, person.address) &&
				Objects.equals(netWorth, person.netWorth);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname, emails, address, netWorth);
	}
}