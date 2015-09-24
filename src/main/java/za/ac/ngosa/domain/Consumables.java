package za.ac.ngosa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public abstract class Consumables <A extends Consumables<A>> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    private double price;
    private String category;
    private String name;


    public A setCategory(String cateValue)
    {
        this.category= cateValue;
        return (A)this;
    }

    public A setCode(long codeValue)
    {
        this.code=codeValue;
        return (A)this;
    }

    public A setPrice(double priceValue)
    {
        this.price=priceValue;
        return (A)this;
    }

    public A setName(String nameValue)
    {
        this.name=nameValue;
        return (A)this;
    }


    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

}
