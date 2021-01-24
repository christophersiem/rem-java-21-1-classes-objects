package de.neuefische.objectsintro;

import de.neuefische.objectsintro.model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student student = new Student("Peter", "Lustig", 3);
        System.out.println(student.toString());
    }


}
