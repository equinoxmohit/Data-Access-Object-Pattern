/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.factorypattern.shapes;

import com.mohitpaudel.factorypattern.interfaces.Shape;

/**
 *
 * @author Mohit
 */
public class Square implements Shape {

    @Override
    public void draw() {

        System.out.println("Inside Square::draw method");
    }

}
