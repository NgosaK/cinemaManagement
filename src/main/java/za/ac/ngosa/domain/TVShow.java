package za.ac.ngosa.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public class TVShow extends Showing implements Serializable{

    private String episode;
    private String season;

    private TVShow(){}

    public String getEpisode()
    {
        return episode;
    }

    public String getSeason()
    {
        return season;
    }


    public TVShow (Builder build)
    {
        this.episode= build.episode;
        this.season= build.season;
        setPrice(build.price);
        setDuration(build.duration);
        setGenre(build.genre);
        setId(build.id);
        setTitle(build.title);
    }

    public static class Builder
    {
        private String episode;
        private String season;
        private String duration;
        private String genre;
        private String title;
        private double price;
        private long id;

        public Builder copy(TVShow value)
        {
            this.episode= value.getEpisode();
            this.season= value.getSeason();
            this.id= value.getId();
            this.duration= value.getDuration();
            this.genre= value.getGenre();
            this.title= value.getTitle();
            this.price= value.getPrice();
            return this;
        }

        public Builder (long idValue)
        {
            this.id=idValue;
        }


        public Builder episode(String episodeValue)
        {
            this.episode=episodeValue;
            return this;
        }

        public Builder season(String seasonValue)
        {
            this.season= seasonValue;
            return  this;
        }

        public Builder title(String titleValue)
        {
            this.title= titleValue;
            return this;
        }

        public Builder duration(String durationValue)
        {
            this.duration=durationValue;
            return this;
        }

        public Builder genre(String genreValue)
        {
            this.genre=genreValue;
            return this;
        }

        public Builder price(double priceValue)
        {
            this.price=priceValue;
            return this;
        }

        public TVShow build()
        {
            return new TVShow(this);
        }

    }

}
