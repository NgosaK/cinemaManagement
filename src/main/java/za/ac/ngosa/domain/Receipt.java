package za.ac.ngosa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public class Receipt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double price ;
    private String item;
    private int quantity;
    private double total ;
    private String cashierName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="movie_code")
    private List<Movie> movies;
    public long getId() {
        return id;
    }

    public List<Movie> getMovieTitle() {
        return movies;
    }
    public double getPrice() {
        return price;
    }

    public String getCashierName() {
        return cashierName;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItem() {
        return item;
    }

    private Receipt()
    {

    }

    public Receipt(Builder builder)
    {
        this.cashierName= builder.cashierName;
        this.price= builder.price;
        this.item= builder.item;
        this.total= builder.total;
        this.quantity= builder.quantity;
        this.id=builder.id;
        this.movies=builder.movies;
    }

    public static class Builder{

        private long id;
        private double price ;
        private String item;
        private int quantity;
        private double total ;
        private String cashierName;
        private List<Movie> movies;

        public Builder copy(Receipt value)
        {
            this.price= value.getPrice();
            this.item= value.getItem();
            this.quantity= value.getQuantity();
            this.id= value.getId();
            this.price= value.getPrice();
            this.total= value.getTotal();
            this.cashierName= value.getCashierName();
            this.movies= value.getMovieTitle();

            return this;
        }


        public Builder (long idValue)
        {
            this.id= idValue;
        }

        public Builder movieTitle(List<Movie> movieTitleValue)
        {
            this.movies=movieTitleValue;
            return this;
        }
        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder item(String itemValue)
        {
            this.item= itemValue;
            return this;
        }

        public Builder quantity (int quantityValue)
        {
            this.quantity= quantityValue;
            return this;
        }

        public Builder total()
        {
            this.total=0;
            this.total= (price * quantity);
            return this;
        }

        public Builder cashierName(String name)
        {
            this.cashierName= name;
            return this;
        }

        public Receipt build()
        {
            return new Receipt(this);
        }
    }
}

