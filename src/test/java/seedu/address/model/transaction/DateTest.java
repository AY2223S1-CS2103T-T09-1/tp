package seedu.address.model.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class DateTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Date(null));
    }

    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        String invalidName = "";
        assertThrows(IllegalArgumentException.class, () -> new Date(invalidName));

        String invalidName2 = "00/00/0000";
        assertThrows(IllegalArgumentException.class, () -> new Date(invalidName2));
    }

    @Test
    public void isValidDate() {
        // null name
        assertThrows(NullPointerException.class, () -> Date.isValidDate(null));

        // invalid date
        assertFalse(Date.isValidDate("")); // empty string
        assertFalse(Date.isValidDate(" ")); // spaces only
        assertFalse(Date.isValidDate("11/09/200*")); // contains non-integers
        assertFalse(Date.isValidDate("11/13/2000")); // invalid month
        assertFalse(Date.isValidDate("39/10/2000")); // invalid day
        assertFalse(Date.isValidDate("-11/11/2000")); // negative integers
        assertFalse(Date.isValidDate("11.223/09/2000.0")); // non-integer values

        // valid date
        assertTrue(Date.isValidDate("11/09/2000")); // integers only
    }

    @Test
    public void toString_returnsValueInName() {
        String value = "22/09/2000";
        String formatedValue = "2000-09-22";
        Date date = new Date(value);
        assertEquals(date.toString(), formatedValue);
    }

    @Test
    public void equals() {
        String value = "22/09/2000";
        Date date = new Date(value);
        Date otherDate = new Date(value);
        assertEquals(date, otherDate);
    }
}
