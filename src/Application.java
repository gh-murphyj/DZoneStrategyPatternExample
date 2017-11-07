/**
 * Created by john on 07/11/17.
 */
public class Application {

    private static final int PAYMENT_TYPE_INDEX = 0;

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addLineItem(new LineItem("Milk", 200));
        bill.addLineItem(new LineItem("Bread", 150));

        bill.pay(PaymentMethodFactory.getPaymentMethod(args[PAYMENT_TYPE_INDEX]));
    }
}

