package se.lexicon.data;

import se.lexicon.model.Patient;

import java.time.LocalDate;
import java.util.Collection;

public interface PatientDAO {

    public Patient create(Patient patient);
    Collection<Patient> findAll();
    Patient findById(String id);
    boolean delete(String id);

    Collection<Patient> findPatientByBirthDateBefore(LocalDate date);


}
