package oop.q3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a university that manages students.
 */
public class University {
    private List<Student> students;

    // Your personal info and courses:
    private final String myName = "Nikoloz";
    private final String mySurname = "Chomakhidze";
    private final String myCountry = "Georgia";
    private final String myPersonalNumber = "01808069233";
    private final String myCourses = "Practical English language course C1-2 (ENG), Calculus II (ENG), Object-oriented programming (ENG), Computer Organization, Mathematical Foundations of Computing (ENG)";

    public University() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.name + " " + s.surname + " from " + s.country);
        }
    }

    /**
     * Returns a string based on the student's info and whether it is you.
     * 1) If the student corresponds to yourself and is in university, returns your current semester courses.
     * 2) If the student corresponds to yourself but is NOT in university, returns your personal number.
     * 3) If the student is NOT you and is in university, returns the info field of the student.
     * 4) Otherwise, returns null.
     */
    public String getStudentInfoStrange(Student s) {
        boolean isMe = s.name.equals(myName) && s.surname.equals(mySurname) && s.country.equals(myCountry);

        if (isMe && students.contains(s)) {
            return myCourses;
        } else if (isMe) {
            return myPersonalNumber;
        } else if (students.contains(s)) {
            return s.info;
        } else {
            return null;
        }
    }
}
