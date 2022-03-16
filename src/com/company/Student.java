package com.company;

public class Student {

    public String studentCard;
    public String name;
    public String groupNumber;

    public Student(String studentCard, String name, String groupNumber) {
        this.studentCard = studentCard;
        this.name = name;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return studentCard + " : " + name + " : " + groupNumber;
    }

    @Override
    public int hashCode() {
        return studentCard.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return studentCard.equals(student.studentCard);
    }
}
