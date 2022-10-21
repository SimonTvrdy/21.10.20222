package com.company;

public class Grade {
    String name;
    String subject;
    int value;
    Teacher teacher;

    public Grade(String name, String subject, int value, Teacher teacher) {
        this.name = name;
        this.subject = subject;
        this.value = value;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", value=" + value +
                ", teacher=" + teacher +
                '}';
    }

    public Grade(Teacher teacher) {
        this.teacher = teacher;
    }
}
