package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import seedu.address.model.company.Company;

/**
 * A utility class containing a list of {@code Company} objects to be used in tests.
 */
public class TypicalCompany {

    public static final Company ALICE = new CompanyBuilder().withName("Alice Pauline").withAddress("4th Street")
            .withTags("friends").build();
    public static final Company BENSON = new CompanyBuilder().withName("Benson Meier").withAddress("5th Avenue")
            .withTags("owesMoney", "friends").build();
    public static final Company CARL = new CompanyBuilder().withName("Carl Kurz").withAddress("Loyang way").build();
    public static final Company DANIEL = new CompanyBuilder().withName("Daniel Meier").withAddress("3rd lane").build();
    public static final Company ELLE = new CompanyBuilder().withName("Elle Meyer").withAddress("Wolf Stress").build();
    public static final Company FIONA = new CompanyBuilder().withName("Fiona Kunz").withAddress("Bedok MRT").build();
    public static final Company GEORGE = new CompanyBuilder().withName("George Best")
            .withAddress("Clementi Mall").build();

    // Manually added
    public static final Company HOON = new CompanyBuilder().withName("Hoon Meier").withAddress("NUS Utown").build();
    public static final Company IDA = new CompanyBuilder().withName("Ida Mueller").withAddress("Raffle hall").build();

    // Manually added - Company's details found in {@code CommandTestUtil}
    public static final Company AMY = new CompanyBuilder().withName(VALID_NAME_AMY)
            .withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Company BOB = new CompanyBuilder().withName(VALID_NAME_BOB)
            .withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalCompany() {} // prevents instantiation

}
