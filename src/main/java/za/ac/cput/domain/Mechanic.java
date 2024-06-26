package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;
/**
 * Mechanic.java
 * This is the Domain program
 * @aurthor Zukhanye Anele Mene (219404275)
 * Date: 03 May 2024
 */
@Entity
public class Mechanic extends Employee {

    private String specialization;

    private boolean availability;



    public Mechanic() {
    }

    private Mechanic (Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.employeeType = builder.employeeType;
        this.specialization = builder.specialization;
        this.availability = builder.availability;

    }


    public String getSpecialization() {
        return specialization;
    }

    public boolean getAvailability() {
        return availability;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return  Objects.equals(specialization, mechanic.specialization) && Objects.equals(availability, mechanic.availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash( specialization, availability);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", Specialization='" + specialization + '\'' +
                ", Availability='" + availability + '\'' +
                '}';
    }

    public static class Builder {

        private String employeeNumber;
        private String firstName;
        private String lastName;
        private String email;
        private String employeeType;

        private String specialization;
        private boolean availability;



        public Builder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder setAvailability(boolean availability) {
            this.availability = availability;
            return this;
        }

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setEmployeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        public Builder copy(Mechanic mechanic) {
            this.employeeNumber = mechanic.employeeNumber;
            this.firstName = mechanic.firstName;
            this.lastName = mechanic.lastName;
            this.email = mechanic.email;
            this.employeeType = mechanic.employeeType;
            this.specialization = mechanic.specialization;
            this.availability = mechanic.availability;
            return this;
        }

        public Mechanic build() {
            return new Mechanic(this);
        }
    }
}