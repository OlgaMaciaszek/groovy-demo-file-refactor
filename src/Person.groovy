/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */
class Person {

	//https://issues.apache.org/jira/browse/GROOVY-1875

	String name
	String surname
	List<String> emails = []
	Address address
	Integer netWorth

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
		return netWorth ?: 0
	}

	void setNetWorth(Integer netWorth) {
		this.netWorth = netWorth
	}

	List<String> getEmails() {
		return emails
	}

	String getFullName(String prefix = 'Ms.') {
		return "$prefix $name $surname"
	}

	void addEmail(String email) {
		emails << email
	}

	String getCity() {
		return address?.city
	}

	void printFirstEmail() {
		println 'Printing first email: '
		if (emails) {
			println emails[0]
		} else {
			println '-'
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