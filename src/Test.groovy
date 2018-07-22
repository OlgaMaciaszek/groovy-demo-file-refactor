/**
 * @author Olga Maciaszek-Sharma
 * @since 3/15/18
 */

Person person = new Person('Anna', 'Smith')
println person.getFullName()
println "Printing city: ${person.getCity()}"
println "Net worth: ${person.netWorth}"
person.netWorth = 1_000_000
println "Net worth: ${person.netWorth}"
person.printFirstEmail()
person.addEmail 'test@test.com'
person.printFirstEmail()
println person
println person.getEmails() == ['test@test.com']