/**
 * Created by john on 06/11/17.
 */
public class DebitCard extends Card {

    public DebitCard(String nameOnCard, String number, String cvv, String expirationDate) {
        super(nameOnCard, number, cvv, expirationDate);
    }

    @Override
    protected String getType() {
        return "debit";
    }

    @Override
    protected void executeTransaction(int cents) {
        // Contact bank to make transaction
    }
}
