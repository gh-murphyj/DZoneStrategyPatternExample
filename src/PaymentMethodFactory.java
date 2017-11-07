/**
 * Created by john on 06/11/17.
 *
 * Factory Method Pattern
 */
public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type) {
        switch (type) {
            case "credit":
                return createCreditCard();
            case "debit":
                return createDebitCard();
            case "cash":
                return createCash();
        }
        throw new IllegalArgumentException();
    }


    private static PaymentMethod createCreditCard() {
        return new CreditCard("John Doe", "1234567812345678", "111", "12/20");
    }

    private static PaymentMethod createDebitCard() {
        return new DebitCard("John Doe", "1234567812345678", "111", "12/20");
    }

    private static PaymentMethod createCash() {
        return new Cash();
    }

}
