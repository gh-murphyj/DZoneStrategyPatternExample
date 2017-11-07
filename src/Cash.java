/**
 * Created by john on 06/11/17.
 */
public class Cash implements PaymentMethod {

    @Override
    public void pay(int cents) {
        System.out.println("Payed " + cents + " cents using cash");
    }
}
