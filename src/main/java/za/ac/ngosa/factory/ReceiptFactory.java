package za.ac.ngosa.factory;

import za.ac.ngosa.domain.Movie;
import za.ac.ngosa.domain.Receipt;

import java.util.List;
import java.util.Map;

/**
 * Created by User on 2015/08/10.
 */
public class ReceiptFactory {

    public static Receipt createReceipt(
            Map<String,String> values, double price,int quantity,List<Movie> movies,
            long id)
    {
        Receipt receipt= new Receipt
                .Builder(id)
                .item(values.get("item"))
                .price(price)
                .quantity(quantity)
                .total()
                .cashierName(values.get("cashierName"))
                .movieTitle(movies)
                .build();

        return receipt;

    }
}
