package za.ac.ngosa.domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by User on 2015/08/10.
 */
@Entity
public class Manager extends Employee implements Serializable {

    private String department;
    private int numberOfEmployees;

    private Manager(){}

    public String getDepartment()
    {
        return department;
    }

    public int getNumOfEmployees()
    {
        return numberOfEmployees;
    }

    public Manager(Builder build)
    {
        this.numberOfEmployees=build.numberOfEmployees;
        this.department=build.department;
        setID(build.id);
        setName(build.name);
        setJobTitle(build.jobTitle);
        setPhoneNumber(build.phoneNumber);
    }

    public static class Builder
    {
        private String department;
        private int numberOfEmployees;
        private long id;
        private String name;
        private String jobTitle;
        private String phoneNumber;

        public Builder copy(Manager value)
        {
            this.department= value.getDepartment();
            this.numberOfEmployees= value.getNumOfEmployees();
            this.name= value.getName();
            this.id= value.getId();
            this.name= value.getName();
            this.jobTitle= value.getJobTitle();
            this.phoneNumber= value.getPhoneNumber();
            return this;
        }

        public Builder (long idValue)
        {
            this.id=idValue;
        }

        public Builder name(String nameValue)
        {
            this.name=nameValue;
            return this;
        }

        public Builder jobTitle(String jobTitleValue)
        {
            this.jobTitle=jobTitleValue;
            return this;
        }

        public Builder phoneNumber(String value)
        {
            this.phoneNumber=value;
            return this;
        }

        public Builder department(String departmentValue)
        {
            this.department= departmentValue;
            return this;
        }

        public Builder numberOfEmployees(int numEmployees)
        {
            this.numberOfEmployees=numEmployees;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }

}
