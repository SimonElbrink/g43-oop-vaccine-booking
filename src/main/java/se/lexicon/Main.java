package se.lexicon;

import se.lexicon.data.PatientDAO;
import se.lexicon.data.PatientDAOIMPL;
import se.lexicon.model.Patient;

import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Patient martin = new Patient(
                "1965-05-14-1234",
                "Martin",
                "Chilling",
                LocalDate.parse("1965-05-14"),
                null);


        PatientDAO patientDAO = new PatientDAOIMPL();

        patientDAO.create(martin);
        patientDAO.create(new Patient("123","243322--2134551", "Test", "Testsson",LocalDate.parse("1990-02-15"),null));

        int size = patientDAO.findAll().size();
        System.out.println("size = " + size);

        Collection<Patient> patientCollection = patientDAO.findAll();

        System.out.println("patientCollection = " + patientCollection);


        Collection<Patient> findBefore = patientDAO.findPatientByBirthDateBefore(LocalDate.parse("1990-02-14"));

        findBefore.forEach(System.out::println);


    }
}