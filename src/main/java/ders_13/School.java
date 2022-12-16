package ders_13;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String nameOfSchool;
    private int maxNumberOfStudent;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String nameOfSchool, int maxNumberOfStudent) {
        setNameOfSchool(nameOfSchool);

        setMaxNumberOfStudent(maxNumberOfStudent);
    }


    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public int getMaxNumberOfStudent() {
        return maxNumberOfStudent;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public void setMaxNumberOfStudent(int maxNumberOfStudent) {
        this.maxNumberOfStudent = maxNumberOfStudent;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
