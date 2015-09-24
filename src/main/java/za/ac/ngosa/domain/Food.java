package za.ac.ngosa.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public class Food extends Consumables implements Serializable {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public Food(Builder builder)
    {
        this.weight=builder.weight;
        setCategory(builder.category);
        setCode(builder.code);
        setPrice(builder.price);
        setName(builder.name);
    }


    public static class Builder
    {
        private long code;
        private String name;
        private String category;
        private double price;
        private double weight;

        public Builder copy(Food value)
        {
            this.category= value.getCategory();
            this.code= value.getCode();
            this.name= value.getName();
            this.weight= value.getWeight();
            this.price= value.getPrice();
            return this;
        }

        public Builder (long codeValue)
        {
            this.code=codeValue;

        }

        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Builder category(String cateValue)
        {
            this.category=cateValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder weight(double weightValue)
        {
            this.weight=weightValue;
            return this;
        }

        public Food build()
        {
            return new Food(this);
        }


    }
}
