/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.dataaccessobjectpattern;

import com.mohitpaudel.dataaccessobjectpattern.DAO.StudentDao;
import com.mohitpaudel.dataaccessobjectpattern.entity.Student;
import com.mohitpaudel.dataaccessobjectpattern.impl.StudentDaoImpl;





/**
 *
 * @author Mohit
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDao sDao=new StudentDaoImpl();
        
        //to print all the information
        for(Student student:sDao.getStudentData())
        {
            System.out.println("The roll number of the student is: " +student.getRoll_number()+"\nThe name of the student is: "+student.getName() +"\nThe address of the student is: "+student.getAddress() +"\nThe country of the student is: "+student.getCountry());
            
        }
        
        //to update the information
        Student student=sDao.getStudentData().get(0);
        student.setName("Sashwat");
        student.setAddress("Rupali-marg");
        sDao.updateStudentData(student);
        
        
        //to display the information updated
        sDao.getStudentByRollNumber(0);
        System.out.println("The name of the student after updating is:" +student.getName() +"\nand the updated address is:" +student.getAddress());
        
        
}
    
}
