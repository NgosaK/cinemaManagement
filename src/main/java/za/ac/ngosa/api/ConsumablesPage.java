package za.ac.ngosa.api;

import za.ac.ngosa.domain.Beverage;
import za.ac.ngosa.domain.Consumables;
import za.ac.ngosa.services.ConsumablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by User on 2015/09/08.
 */
@RestController
@RequestMapping("/schedule/**")
public class ConsumablesPage {

    @Autowired
    private ConsumablesService service;

    //-------------------Retrieve All Consumables--------------------------------------------------------

    @RequestMapping(value = "/consumables/", method = RequestMethod.GET)
    public ResponseEntity<List<Beverage>> listAllConsumables() {
        List<Beverage> consumablesList = service.getConsumables();
        if (consumablesList.isEmpty()) {
            return new ResponseEntity<List<Beverage>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Beverage>>(consumablesList, HttpStatus.OK);
    }

    //-------------------Retrieve Single Cosnumable--------------------------------------------------------
    @RequestMapping(value = "/consumables/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Consumables> getSubject(@PathVariable("id") long id) {
        System.out.println("Fetching consumable with id: " + id);
        Consumables consumables = service.getConsumables(id);
        if (consumables == null) {
            System.out.println("Subject with id " + id + " not found");
            return new ResponseEntity<Consumables>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Consumables>(consumables, HttpStatus.OK);
    }

    //-------------------Create a Consumable--------------------------------------------------------

    @RequestMapping(value = "/consumables/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createSubject(@RequestBody Beverage consumables,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating consumables " + consumables.getName());

//     USE THIS IF YOU WANT TO CHECK UNIQUE OBJECT
//      if (ConsumableService.isSubjectExist(Subject)) {
//            System.out.println("A Subject with name " + Subject.getName() + " already exist");
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }

        service.addConsumables(consumables);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/consumables/{id}").buildAndExpand(consumables.getCode()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Update a Consumables --------------------------------------------------------

    @RequestMapping(value = "/consumables/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Consumables> updateSubject(@PathVariable("id") long id, @RequestBody Consumables consumables)
    {
        System.out.println("Updating consumable " + id);

        Consumables currentConsumable = service.getConsumables(id);

        if (currentConsumable==null) {
            System.out.println("Consumable with id " + id + " not found");
            return new ResponseEntity<Consumables>(HttpStatus.NOT_FOUND);
        }

        Beverage updatedConsumable = new Beverage

                .Builder(currentConsumable.getCode())
                .copy((Beverage) currentConsumable)
                .build();
        service.updateConsumables(updatedConsumable);
        return new ResponseEntity<Consumables>(updatedConsumable, HttpStatus.OK);
    }

    //------------------- Delete a Consumable --------------------------------------------------------

    @RequestMapping(value = "/subject/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Beverage> deleteConsumable(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting Consumable with id " + id);

        Beverage consumables = (Beverage) service.getConsumables(id);
        if (consumables == null) {
            System.out.println("Unable to delete. Subject with id " + id + " not found");
            return new ResponseEntity<Beverage>(HttpStatus.NOT_FOUND);
        }

        service.removeConsumables(consumables);
        return new ResponseEntity<Beverage>(HttpStatus.NO_CONTENT);
    }

}
