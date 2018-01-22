/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.FactoryMethod;
import Creational.FactoryMethod.Shape.*;
/**
 *
 * @author argshub
 */
public class Canvas {
    
    
    public void generateNewShape(ShapeTypes shapeType) {
        Shapes shapes = null;
        switch(shapeType) {
            case CIRCLE:
                shapes = new Circle();
                break;
            case RECTANGLE:
                shapes = new Rectangle();
                break;
            case POLYGON:
                shapes = new Polygon();
                break;
        }
        shapes.draw();
    }
    
}
