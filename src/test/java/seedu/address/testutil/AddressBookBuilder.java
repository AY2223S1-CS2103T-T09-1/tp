package seedu.address.testutil;

import seedu.address.model.JeeqTracker;
import seedu.address.model.person.Person;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
 *     {@code JeeqTracker ab = new AddressBookBuilder().withPerson("John", "Doe").build();}
 */
public class AddressBookBuilder {

    private JeeqTracker jeeqTracker;

    public AddressBookBuilder() {
        jeeqTracker = new JeeqTracker();
    }

    public AddressBookBuilder(JeeqTracker jeeqTracker) {
        this.jeeqTracker = jeeqTracker;
    }

    /**
     * Adds a new {@code Person} to the {@code JeeqTracker} that we are building.
     */
    public AddressBookBuilder withPerson(Person person) {
        jeeqTracker.addPerson(person);
        return this;
    }

    public JeeqTracker build() {
        return jeeqTracker;
    }
}
