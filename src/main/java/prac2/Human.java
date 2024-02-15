package prac2;

import java.time.LocalDate;

public class Human {
    public Integer age;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public Integer weight;
    Human(int ag, String fN, String lN, LocalDate bD, Integer w) {
        this.age = ag;
        this.firstName = fN;
        this.lastName = lN;
        this.birthDate = bD;
        this.weight = w;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                '}';
    }
}
