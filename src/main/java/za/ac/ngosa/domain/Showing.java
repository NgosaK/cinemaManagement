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
public abstract class Showing<A extends Showing<A>> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String duration;
    private String genre;
    private String title;
    private double price;

    public A setId(long idValue)
    {
        this.id=idValue;
        return (A)this;
    }

    public A setTitle(String titleValue)
    {
        this.title= titleValue;
        return (A)this;
    }

    public A setDuration(String durationValue)
    {
        this.duration=durationValue;
        return (A)this;
    }

    public A setGenre(String genreValue)
    {
        this.genre=genreValue;
        return (A)this;
    }

    public A setPrice(double priceValue)
    {
        this.price=priceValue;
        return (A)this;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }


}

