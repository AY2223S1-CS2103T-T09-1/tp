package seedu.watson.model;

import javafx.collections.ObservableList;
import seedu.watson.model.person.Person;

/**
 * Unmodifiable view of an watson book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();

}
