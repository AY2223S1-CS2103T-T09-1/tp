package seedu.address.model.company;

import java.util.function.Predicate;

/**
 * Tests that a {@code Company}'s {@code Name} matches the keyword given exactly.
 */
public class NameEqualsKeywordPredicate implements Predicate<Company> {
    private final String keyword;

    public NameEqualsKeywordPredicate(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean test(Company company) {
        String companyName = company.getName().toString();

        return companyName.equals(this.keyword);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof NameEqualsKeywordPredicate // instanceof handles nulls
                && keyword.equals(((NameEqualsKeywordPredicate) other).keyword)); // state check
    }
}
