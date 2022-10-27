package seedu.address.model.transaction;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.core.PriceFormatter.formatPrice;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Class to store the price of the goods transacted.
 */
public class Price {
    public static final String MESSAGE_CONSTRAINTS =
            "Price should only contain numbers, and it should be at least 1 digits long";
    public static final String MESSAGE_CONSTRAINTS_POSITIVE =
            "Price should be not be negative.";
    public final String price;


    /**
     * Constructs a {@code Price}.
     *
     * @param price A valid price.
     */
    public Price(String price) {
        requireNonNull(price);
        checkArgument(isValidPrice(price), MESSAGE_CONSTRAINTS);
        checkArgument(isPositivePrice(price), MESSAGE_CONSTRAINTS_POSITIVE);
        this.price = price;
    }

    /**
     * Returns true if a given string is a valid price.
     */
    public static boolean isValidPrice(String test) {
        requireNonNull(test);
        boolean isDouble = true;
        double num = 0.00;
        try {
            num = Double.parseDouble(test);
        } catch (NumberFormatException e) {
            isDouble = false;
        }
        return isDouble;
    }

    /**
     * Returns true if a give string is a valid positive price.
     */
    public static boolean isPositivePrice(String test) {
        return !test.contains("-");
    }

    @Override
    public String toString() {
        return formatPrice(this.value());
    }

    public double value() {
        return Double.parseDouble(price);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Price // instanceof handles nulls
                && price.equals(((Price) other).price)); // state check
    }

}
