/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */
class Address {

	private String streetAddress
	private String postalCode
	private String city

	String getStreetAddress() {
		return streetAddress
	}

	void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress
	}

	String getPostalCode() {
		return postalCode
	}

	void setPostalCode(String postalCode) {
		this.postalCode = postalCode
	}

	String getCity() {
		return city
	}

	void setCity(String city) {
		this.city = city
	}
}
