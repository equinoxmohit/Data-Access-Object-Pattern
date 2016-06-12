/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.factorypattern.cocrete;

import com.mohitpaudel.factorypattern.interfaces.Shape;
import com.mohitpaudel.factorypattern.shapes.Circle;
import com.mohitpaudel.factorypattern.shapes.Rectangle;
import com.mohitpaudel.factorypattern.shapes.Square;

/**
 *
 * @author Mohit
 */
public class ShapeFactory {
    public Shape getShape(String shapeType)
    {
        if(shapeType==null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle"))
        {
        return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        return null;
        
    }
    
}
