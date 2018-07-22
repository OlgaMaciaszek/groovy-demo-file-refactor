import groovy.transform.Canonical

/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */
@Canonical
class Person {

	//https://issues.apache.org/jira/browse/GROOVY-1875

	String name
	String surname
	List<String> emails = []
	Address address
	Integer netWorth

	Integer getNetWorth() {
		return netWorth ?: 0
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
}