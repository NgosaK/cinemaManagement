package za.ac.ngosa.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by User on 2015/08/22.
 */
public class MovieResource extends ResourceSupport {

    private String duration;
    private String genre;
    private String title;
    private double price;
    private  String type;
    private long id;

    private MovieResource()
    {

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

    public long getID() {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public MovieResource(Builder builder)
    {

        this.id= builder.id;
        this.genre= builder.genre;
        this.duration= builder.duration;
        this.price= builder.price;
        this.title= builder.title;
        this.type= builder.type;

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

        public Builder type(String typeValue)
        {
            this.type=typeValue;
            return this;
        }

        public Builder copy(MovieResource build)
        {
            this.price= build.price;
            this.duration= build.duration;
            this.genre= build.genre;
            this.id= build.id;
            this.title= build.title;
            this.type= build.type;
            return this;
        }

        public MovieResource build()
        {
            return new MovieResource(this);
        }


    }



}
