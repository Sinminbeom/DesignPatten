package com.study.DesignPatten._01_creational_patterns.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student minbeom = new Student("minbeom");
        Student subin = new Student("subin");
        List<Student> students = new ArrayList<>();
        students.add(minbeom);
        students.add(subin);

        students.get(0).setName("shinminbeom");

        List<Student> studentList = new ArrayList<>(students);

//        List<Student> studentList = ((List<Student>)((ArrayList<Student>)students).clone());
        System.out.println(studentList);
        System.out.println(studentList == students);
        System.out.println(studentList.equals(students));
        System.out.println(students.get(0).getName());
        System.out.println(studentList.get(0).getName());
    }
}
