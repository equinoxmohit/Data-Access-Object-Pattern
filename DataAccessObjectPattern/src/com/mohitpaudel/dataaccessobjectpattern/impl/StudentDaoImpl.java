/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.dataaccessobjectpattern.impl;

import com.mohitpaudel.dataaccessobjectpattern.DAO.StudentDao;
import com.mohitpaudel.dataaccessobjectpattern.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public class StudentDaoImpl implements StudentDao{
    ArrayList<Student> students;
    
    public StudentDaoImpl()
    {
        students=new ArrayList<>();
        Student student1=new Student("Ram", "Kusunti", "Nepal", 1);
        Student student2=new Student("Ching", "Xing", "China", 2);
        Student student3=new Student("Rambo","Colorado","Usa",3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }
    
    
    @Override
    public ArrayList<Student> getStudentData() {
       return students;
    }

    @Override
    public void deleteStudentData(Student student) {
        students.remove(student.getRoll_number());
        System.out.println("The roll number: " +student.getRoll_number() + " is removed");
    }

    @Override
    public void updateStudentData(Student student) {
       students.get(student.getRoll_number()).setName(student.getName());
        System.out.println("The updated roll number is: " +student.getRoll_number());
    }

    @Override
    public Student getStudentByRollNumber(int roll_number) {
       return students.get(roll_number);
    }

}
