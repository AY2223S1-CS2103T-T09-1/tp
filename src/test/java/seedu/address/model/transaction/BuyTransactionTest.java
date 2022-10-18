package seedu.address.model.transaction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class BuyTransactionTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new BuyTransaction(null, null, null, null));
    }

    @Test
    public void totalCost() {
        Goods goods = new Goods("Apple");
        Price price = new Price("0.8");
        Quantity quantity = new Quantity("10");
        Date date = new Date("17/05/2000");

        Transaction transaction = new BuyTransaction(goods, price, quantity, date);
        assertEquals(transaction.totalCost(), -8);
        assertFalse(transaction.totalCost() == 8);
    }

    @Test
    public void testToString() {
        Goods goods = new Goods("Apple");
        Price price = new Price("0.8");
        Quantity quantity = new Quantity("10");
        Date date = new Date("17/05/2000");

        Transaction transaction = new BuyTransaction(goods, price, quantity, date);
        assertTrue(transaction.toString().equals("You bought 10 quantity of Apple at $0.8 each on 2000-05-17"));
    }

    @Test
    public void testEquals() {
        Goods goods = new Goods("Apple");
        Price price = new Price("0.8");
        Quantity quantity = new Quantity("10");
        Date date = new Date("17/05/2000");

        Transaction transaction = new BuyTransaction(goods, price, quantity, date);
        assertEquals(transaction, new BuyTransaction(goods, price, quantity, date));
        assertFalse(transaction.equals(new Object()));
    }

    @Test
    public void testDateEquals() {
        Goods goods = new Goods("Apple");
        Price price = new Price("0.8");
        Quantity quantity = new Quantity("10");
        Date date = new Date("17/05/2000");

        Transaction transaction = new BuyTransaction(goods, price, quantity, date);
        assertEquals(transaction.getDate(), new BuyTransaction(goods, price, quantity, date).getDate());
    }
}
