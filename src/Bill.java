import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 07/11/17.
 */
public class Bill {

    List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public void removeLineItem(LineItem lineItem) {
        lineItems.remove(lineItem);
    }

    public int getCostInCents() {
        /* Bit of explaining as this is using new streams and lambdas. Basically we want to create a stream of
         * LineItem from the array, convert that to a stream of int containg the cost of each LineItem, and then
         * sum the stream of int. The steps are as follows:
          *
          * 1. Create a stream of LineItems: lineItems.stream()
          * 2. Convert to a stream of int: mapToInt
          * 3. Containg the cost of each LineItem: item -> getCostInCents()
          * 4. Sum the stream of int: sum()
          *
          * */
        return lineItems.stream().mapToInt(item -> item.getCostInCents()).sum();
    }

    public void pay(PaymentMethod method) {
        method.pay(getCostInCents());
    }
}
