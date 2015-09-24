package za.ac.ngosa.services;

import za.ac.ngosa.domain.Receipt;

import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
public interface ReceiptService {

    List<Receipt> getReceipts();

    Receipt getReceipt(long id);
    Receipt addReceipt(Receipt receipt);
    void removeReceipt(Receipt receipt);
    Receipt updateReceipt(Receipt receipt);

}
