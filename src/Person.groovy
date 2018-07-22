/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */
class Person {

	private String name
	private String surname
	private List<String> emails = []
	private Address address
	private Integer netWorth

	Person() {
	}

	Person(String name, String surname) {
		this.name = name
		this.surname = surname
	}

	Person(String name, String surname, List<String> emails) {
		this(name, surname)
		this.emails = emails
	}

	Integer getNetWorth() {
		return netWorth != null ? netWorth : 0
	}

	void setNetWorth(Integer netWorth) {
		this.netWorth = netWorth
	}

	List<String> getEmails() {
		return emails
	}

	String getFullName() {
		return getFullName("Ms.")
	}

	String getFullName(String prefix) {
		return prefix + " " + name + " " + surname
	}

	void addEmail(String email) {
		emails << email
	}

	String getCity() {
		if (address != null) {
			return address.getCity()
		}
		return null
	}

	void printFirstEmail() {
		System.out.print("Printing first email: ")
		if (emails.size() >= 1) {
			System.out.println(emails.get(0))
		} else {
			System.out.println("-")
		}
	}

	boolean sameEmails(List<String> emails) {
		return this.emails == emails
	}

	@Override
	String toString() {
		return "DemoClass{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", emails=" + emails +
				", address=" + address +
				", netWorth=" + netWorth +
				'}'
	}

	@Override
	boolean equals(Object o) {
		if (this == o) return true
		if (!(o instanceof Person)) return false
		Person person = (Person) o
		return Objects.equals(name, person.name) &&
				Objects.equals(surname, person.surname) &&
				Objects.equals(emails, person.emails) &&
				Objects.equals(address, person.address) &&
				Objects.equals(netWorth, person.netWorth)
	}

	@Override
	int hashCode() {
		return Objects.hash(name, surname, emails, address, netWorth)
	}
}