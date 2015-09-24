package za.ac.ngosa.model;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by User on 2015/08/10.
 */
public class ScheduleResource extends ResourceSupport {

    private long id;
    private int duration ;
    private String title;
    private int startTime;
    private int endTime;

    private ScheduleResource()  {}

    public int getEndTime() {
        return endTime;
    }
    public int getStartTime() {
        return startTime;
    }
    public long getID() {return id;}
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }

    public ScheduleResource(Builder build)
    {
        this.duration= build.duration;
        this.title= build.title;
        this.startTime= build.startTime;
        this.endTime= build.endTime;
        this.id=build.id;
    }

    public static class Builder
    {
        private int duration ;
        private String title;
        private int startTime;
        private int endTime;
        private long id;

        public Builder (long idValue)
        {
            this.id=idValue;
        }

        public Builder duration(int durationValue)
        {
            this.duration= durationValue;
            return this;
        }

        public Builder title(String titleValue)
        {
            this.title= titleValue;
            return this;
        }

        public Builder startTime(int startTimeValue)
        {

            this.startTime= startTimeValue;
            return this;
        }

        public Builder endTime(int endTime)
        {
            this.endTime=0;
            this.endTime= startTime + duration;
            return this;
        }

        public Builder copy(ScheduleResource build)
        {
            this.duration= build.duration;
            this.title= build.title;
            this.startTime= build.startTime;
            this.id= build.id;
            this.endTime= build.endTime;
            return this;
        }

        public ScheduleResource build()
        {
            return new ScheduleResource(this);
        }

    }
}
