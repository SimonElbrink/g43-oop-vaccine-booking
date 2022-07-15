package se.lexicon.model;

import java.util.Objects;

public class Premises {

    private String id;
    private String name;
    private ContactInfo contactInfo;

    public Premises(String id, String name, ContactInfo contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Premises() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Premises premises = (Premises) o;
        return Objects.equals(id, premises.id) && Objects.equals(name, premises.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Premises{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
