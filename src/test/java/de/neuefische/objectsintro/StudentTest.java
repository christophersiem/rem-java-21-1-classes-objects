package de.neuefische.objectsintro;

import de.neuefische.objectsintro.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void getFirstNameShouldReturnFirstName() {
        //GIVEN
        Student student = new Student("Hans", "Meier", 8);
        String firstName = "Paul";

        //WHEN
        student.setFirstName(firstName);

        //THEN
        assertEquals(firstName, student.getFirstName());
    }

    @Test
    public void getLastNameShouldReturnFirstName() {
        //GIVEN
        Student student = new Student("Hans", "Meier", 8);
        String lastName = "Lustig";

        //WHEN
        student.setLastName(lastName);

        //THEN
        assertEquals(lastName, student.getLastName());
    }


    @Test
    public void getMatriculationNumberShouldReturnMatriculationNumber() {
        //GIVEN
        Student student = new Student("Hans", "Meier", 8);
        int matriculationNumber = 42;

        //WHEN
        student.setMatriculationNumber(matriculationNumber);

        //THEN
        assertEquals(matriculationNumber, student.getMatriculationNumber());
    }

    @Test
    public void toStringShouldReturnStringOfObject() {
        //GIVEN
        Student student = new Student("Hans", "Meier", 8);
        String expected = "Student: " + "Hans" + " " + "Meier" + ", ID:" + 8;

        //WHEN
        String actual = student.toString();

        //THEN
        assertEquals(expected, actual);

    }

}
