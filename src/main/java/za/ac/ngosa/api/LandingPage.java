package za.ac.ngosa.api;

import za.ac.ngosa.domain.Beverage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 2015/09/22.
 */
@RestController
@RequestMapping("/")
public class LandingPage {
    @RequestMapping(method = RequestMethod.GET)
    public Beverage getBeverage(){
        Beverage beverage = new Beverage.Builder(23).price(50).name("Aqua").category("Water").volume(500).build();
        return beverage;
    }
}
