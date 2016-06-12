/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.dataaccessobjectpattern.DAO;

import com.mohitpaudel.dataaccessobjectpattern.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public interface StudentDao {

    ArrayList<Student> getStudentData();

    void deleteStudentData(Student student);

    void updateStudentData(Student student);

    Student getStudentByRollNumber(int roll_number);

}
