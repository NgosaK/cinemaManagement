package za.ac.ngosa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ADRIAN on 17/4/2015.
 */
@Entity
public abstract class Employee <A extends Employee<A>> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String jobTitle;
    private String phoneNumber;

    public A setID(long id)
    {
        this.id= id;
        return (A)this;
    }

    public A setName(String name)
    {
        this.name= name;
        return (A)this;
    }

    public A setJobTitle(String jobTitle)
    {
        this.jobTitle= jobTitle;
        return (A)this;
    }

    public A setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber= phoneNumber;
        return (A)this;
    }


    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}