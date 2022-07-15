package se.lexicon.model;

import java.util.Objects;
import java.util.UUID;

public class Premises {

    private String id;
    private String name;
    private ContactInfo contactInfo;

    public Premises(String id, String name, ContactInfo contactInfo) {
        this.id = id;
        setName(name);
        setContactInfo(contactInfo);
    }

    public Premises(String name, ContactInfo contactInfo) {
        this(UUID.randomUUID().toString(),
                name,contactInfo
                );
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
        if (name == null) throw new IllegalArgumentException("name not allowed to be null!");
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        if (contactInfo == null) throw new IllegalArgumentException("contactInfo not allowed to be null!");
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
