package za.ac.ngosa.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public class Movie extends Showing implements Serializable {

    private String type;

    private Movie() {}

    public  String getType()
    {
        return type;
    }

    public Movie(Builder build)
    {
        this.type= build.type;
        setId(build.id);
        setTitle(build.title);
        setGenre(build.genre);
        setDuration(build.duration);
        setPrice(build.price);
    }

    public static class Builder
    {
        private String duration;
        private String genre;
        private String title;
        private double price;
        private  String type;
        private long id;



        public Builder (long idValue)
        {
            this.id=idValue;
        }

        public Builder duration(String durationValue)
        {
            this.duration= durationValue;
            return this;
        }

        public Builder genre (String genreValue)
        {
            this.genre= genreValue;
            return this;
        }

        public Builder title (String titleValue)
        {
            this.title= titleValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public Builder copy(Movie value)
        {
            this.duration= value.getDuration();
            this.genre= value.getGenre();
            this.title= value.getTitle();
            this.price= value.getPrice();
            this.type= value.getType();
            return this;
        }

        public Builder type(String typeValue)
        {
            this.type=typeValue;
            return this;
        }

        public Movie build()
        {
            return new Movie(this);
        }


    }

}
