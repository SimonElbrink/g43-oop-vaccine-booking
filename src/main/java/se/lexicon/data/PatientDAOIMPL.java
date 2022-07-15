package se.lexicon.data;

import se.lexicon.model.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PatientDAOIMPL implements PatientDAO {


    private List<Patient> patientList;

    public PatientDAOIMPL() {
        patientList = new ArrayList<>();
    }

    @Override
    public Patient create(Patient patient) {
        if (patient == null) throw new IllegalArgumentException("Patient was null, Not Allowed!");

        patientList.add(patient);
        return patient;
    }

    @Override
    public Collection<Patient> findAll() {
        return patientList;
    }

    @Override
    public Patient findById(String id) {
        for (Patient p : patientList) {

            if (p.getId().equals(id)){
                return p;
            }

        }

        return null;
    }

    @Override
    public boolean delete(String id) {
        return patientList.remove(findById(id));
    }

    @Override
    public Collection<Patient> findPatientByBirthDateBefore(LocalDate date) {
        Collection<Patient> foundMatches = new ArrayList<>();
        //finding  Patient's  if they are born before a specific time.

        for (Patient p : patientList) {
            if (p.getBirthDate().isBefore(date) || p.getBirthDate().equals(date) ){
                foundMatches.add(p);
            }
        }

        return foundMatches;
    }
}
