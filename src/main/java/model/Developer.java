package model;

/**
 * Created by Владислав on 24.03.2017.
 */
import java.io.Serializable;

/**
 * @author Владислав
 * @entity class
 * @version 1.0
 */
public class Developer implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String speciality;
    private int experiance;

    public Developer(int id, String firstName, String lastName, String speciality, int experiance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.experiance = experiance;
    }

    @Override
    public String toString() {
        return "Developer " +
                "i=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experiance=" + experiance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
}
