/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.factorypattern;

import com.mohitpaudel.factorypattern.cocrete.ShapeFactory;
import com.mohitpaudel.factorypattern.interfaces.Shape;

/**
 *
 * @author Mohit
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapefactory=new ShapeFactory();
        
        Shape shape1=shapefactory.getShape("Circle");
        shape1.draw();
        
        Shape shape2=shapefactory.getShape("Rectangle");
        shape2.draw();
        
        Shape shape3=shapefactory.getShape("Square");
        shape3.draw();
        
    }

}
