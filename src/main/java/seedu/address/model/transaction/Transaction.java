package seedu.address.model.transaction;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

/**
 * Abstract transaction class
 */
public abstract class Transaction {

    protected final Goods goods;
    protected final Price price;
    protected final Quantity quantity;
    protected final Date date;

    Transaction(Goods goods, Price price, Quantity quantity, Date date) {
        requireAllNonNull(goods, price, quantity, date);
        this.goods = goods;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }

    /**
     * Calculates the total cost of transaction
     * @return total cost
     */
    abstract double totalCost();

    public Goods getGoods() {
        return goods;
    }

    public Price getPrice() {
        return price;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return goods.toString();
    }

}
