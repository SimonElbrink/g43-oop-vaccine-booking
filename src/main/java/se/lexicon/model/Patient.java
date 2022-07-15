package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Patient {

    private String id;
    private String ssn;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private ContactInfo contactInfo;

    public Patient(String id, String ssn, String firstName, String lastName, LocalDate birthDate, ContactInfo contactInfo) {
        this.id = id;
        setSsn(ssn);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.contactInfo = contactInfo;
    }

    public Patient(String ssn, String firstName, String lastName, LocalDate birthDate, ContactInfo contactInfo) {
        this(UUID.randomUUID().toString(),
                ssn,firstName,lastName,birthDate,contactInfo);
    }

    public Patient() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null) throw new IllegalArgumentException("ssn not allowed to be null!");
        this.ssn = ssn;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(ssn, patient.ssn) && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName) && Objects.equals(birthDate, patient.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ssn, firstName, lastName, birthDate);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
