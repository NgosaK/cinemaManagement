package za.ac.ngosa.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public class Beverage extends Consumables implements Serializable{

    private double volume;


    public double getVolume() {
        return volume;
    }

    private Beverage()
    {

    }

    public Beverage(Builder build)
    {
        this.volume=build.volume;
        setCategory(build.category);
        setCode(build.code);
        setPrice(build.price);
        setName(build.name);
    }

    public static class Builder
    {
        private long code;
        private double volume;
        private double price;
        private String category;
        private String name;

        public Builder volume(double volumeValue)
        {
            this.volume= volumeValue;
            return  this;
        }

        public Builder category(String cateValue)
        {
            this.category= cateValue;
            return this;
        }

        public Builder (long codeValue)
        {
            this.code=codeValue;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder copy(Beverage value)
        {
            this.category= value.getCategory();
            this.code= value.getCode();
            this.name= value.getName();
            this.volume= value.getVolume();
            this.price= value.getPrice();
            return this;
        }


        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Beverage build()
        {
            return new Beverage(this);
        }

    }
}

