package za.ac.ngosa.api;

import za.ac.ngosa.domain.Receipt;
import za.ac.ngosa.services.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by User on 2015/09/14.
 */
@RestController
@RequestMapping(value="/receipt/**")
public class ReceiptPage {

    @Autowired
    private ReceiptService service;

    //-------------------Retrieve All Receipts--------------------------------------------------------

    @RequestMapping(value = "/receipts/", method = RequestMethod.GET)
    public ResponseEntity<List<Receipt>> listAllReceipts() {
        List<Receipt> Subjects = service.getReceipts();
        if(Subjects.isEmpty()){
            return new ResponseEntity<List<Receipt>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Receipt>>(Subjects, HttpStatus.OK);
    }

    //-------------------Retrieve Single Receipt--------------------------------------------------------

    @RequestMapping(value = "/receipt/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Receipt> getSubject(@PathVariable("id") long id) {
        System.out.println("Fetching Receipt with id " + id);
        Receipt receipt = service.getReceipt(id);
        if (receipt == null) {
            System.out.println("Subject with id " + id + " not found");
            return new ResponseEntity<Receipt>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Receipt>(receipt, HttpStatus.OK);
    }

    //-------------------Create a Receipt--------------------------------------------------------

    @RequestMapping(value = "/receipt/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createReceipt(@RequestBody Receipt receipt,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating receipt " + receipt.getCashierName());

//     USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
//      if (SubjectService.isSubjectExist(Subject)) {
//            System.out.println("A Subject with name " + Subject.getName() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }

        service.addReceipt(receipt);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/subject/{id}").buildAndExpand(receipt.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Update a Subject --------------------------------------------------------

    @RequestMapping(value = "/receipt/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Receipt> updateReceipt(@PathVariable("id") long id, @RequestBody Receipt receipt) {
        System.out.println("Updating receipt " + id);

        Receipt currentReceipt = service.getReceipt(id);

        if (currentReceipt==null) {
            System.out.println("Subject with id " + id + " not found");
            return new ResponseEntity<Receipt>(HttpStatus.NOT_FOUND);
        }

        Receipt updatedReceipt = new Receipt
                .Builder(currentReceipt.getId())
                .copy(currentReceipt)
                .build();
        service.updateReceipt(updatedReceipt);
        return new ResponseEntity<Receipt>(updatedReceipt, HttpStatus.OK);
    }

    //------------------- Delete a Receipt --------------------------------------------------------

    @RequestMapping(value = "/receipt/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Receipt> deleteReceipt(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting receipt with id " + id);

        Receipt receipt = service.getReceipt(id);
        if (receipt == null) {
            System.out.println("Unable to delete. Receipt with id " + id + " not found");
            return new ResponseEntity<Receipt>(HttpStatus.NOT_FOUND);
        }

        service.removeReceipt(receipt);
        return new ResponseEntity<Receipt>(HttpStatus.NO_CONTENT);
    }






}
