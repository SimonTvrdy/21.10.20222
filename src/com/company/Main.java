package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jan");
        Student student = new Student("Stepan");
        student.addGrade(new Grade("Ctvrtletka", "Matematika", 5, teacher));
        student.addGrade(new Grade("Diktat", "Cestina", 7, teacher));
        student.showAllGrades();

    }
}
