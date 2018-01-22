/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Creational.FactoryMethod.Canvas;
import Creational.FactoryMethod.Shape.ShapeTypes;
/**
 *
 * @author argshub
 */
public class FactoryMethodTest {
    
    
    public static void main(String arg[]) {
        Canvas canvas = new Canvas();
        canvas.generateNewShape(ShapeTypes.CIRCLE);
        canvas.generateNewShape(ShapeTypes.RECTANGLE);
        canvas.generateNewShape(ShapeTypes.POLYGON);
    }
}
