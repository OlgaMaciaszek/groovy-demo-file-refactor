/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */
Person person = new Person("Anna", "Smith")
System.out.println(person.getFullName())
System.out.println("Printing city: " + person.getCity())
System.out.println("Net worth: " + person.getNetWorth())
person.setNetWorth(1000000)
System.out.println("Net worth: " + person.getNetWorth())
person.printFirstEmail()
person.addEmail("test@test.com")
person.printFirstEmail()
System.out.println(person.toString())
System.out.println(person.getEmails().equals(Collections.singletonList("test@test.com")))