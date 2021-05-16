package za.ac.cput.assignment2.assignment2.assignment2.assignment2;
/*
 * @Author
 *Full Name: Nikitha Mbokotwana
 * Student Number: 218337906
 * This is a main class
 */
import java.util.Objects;

public class Registration {

    private String petTypes;
    private String petName;
    private String years;


    private int uniqueNumber;

    public Registration(String petTypes, int uniqueNumber) {
        this.petTypes = petTypes;
        this.uniqueNumber = uniqueNumber;

    }

    public Registration(String petTypes) {
    }


    public String getPetType() {
        return petTypes;
    }

    public void setPetType(String petType) {
        this.petTypes = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public long getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(long uniqueNumber) {
        this.uniqueNumber = (int) uniqueNumber;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "petType='" + petTypes + '\'' +
                ", petName='" + petName + '\'' +
                ", years=" + years +
                ", uniqueNumber=" + uniqueNumber +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(uniqueNumber);
    }
}
