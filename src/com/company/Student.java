package com.company;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Grade> grades = new ArrayList<Grade>();
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    public void showAllGrades(){
        System.out.println(grades);
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
