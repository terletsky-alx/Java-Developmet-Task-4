package com.university.students.model;

public class Student {
    private String firstName;
    private String lastName;
    private int course;

    public Student(String firstName, String lastName, int course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.course = course;
    }
    public Student(){}

    public String getName(){
        return "Фамилия: " + firstName + "Имя: " + lastName;
    }
    public int getCourse(){
        return course;
    }
}
