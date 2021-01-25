package de.neuefische.objectsintro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void getFirstNameShouldReturnFirstName() {
        //GIVEN
        Student student = new Student();
        String firstName = "Paul";

        //WHEN
        student.setFirstName(firstName);

        //THEN
        assertEquals(firstName, student.getFirstName());
    }

    @Test
    public void getLastNameShouldReturnFirstName() {
        //GIVEN
        Student student = new Student();
        String lastName = "Lustig";

        //WHEN
        student.setLastName(lastName);

        //THEN
        assertEquals(lastName, student.getLastName());
    }


    @Test
    public void getMatriculationNumberShouldReturnMatriculationNumber() {
        //GIVEN
        Student student = new Student();
        int matriculationNumber = 42;

        //WHEN
        student.setMatriculationNumber(matriculationNumber);

        //THEN
        assertEquals(matriculationNumber, student.getMatriculationNumber());
    }

}
