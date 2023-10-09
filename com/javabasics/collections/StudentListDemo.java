package com.javabasics.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentListDemo {
    public static void main(String[] args) {
        Student John=new Student(30,"John Doe");
        Student sachin=new Student(50,"Sachin T");
        Student narendra=new Student(70,"Narendra M");
        Student pramod=new Student(55,"Pramod P");

        List<Student> studentList=new ArrayList<Student>();
        studentList.add(John);studentList.add(sachin);studentList.add(narendra);studentList.add(pramod);

        List<Student> updatedList=removeStudents(studentList);
        System.out.println("Updated list "+updatedList);

    }

    private static List<Student> removeStudents(List<Student> studentList) {


        return studentList.stream().filter(s->s.marks<35).collect(Collectors.toList());
    }
}


class Student{

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    int marks;
    String name;
}