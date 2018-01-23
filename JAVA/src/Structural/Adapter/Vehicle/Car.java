/*
* MIT License
* Copyright (c) 2017 argshub
*
*Permission is hereby granted, free of charge, to any person obtaining a copy
*of this software and associated documentation files (the "Software"), to deal
*in the Software without restriction, including without limitation the rights
*to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*copies of the Software, and to permit persons to whom the Software is
*furnished to do so, subject to the following conditions:

*The above copyright notice and this permission notice shall be included in all
*copies or substantial portions of the Software.
*
*THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*SOFTWARE.
 */
package Structural.Adapter.Vehicle;
import Structural.Adapter.Engine.VehicleEngine;
import Structural.Adapter.Engine.CarEngine;
import Structural.Adapter.Switch.VehicleSwitch;
import Structural.Adapter.Switch.CarSwitch;
import Structural.Adapter.Speed.SpeedController;
import Structural.Adapter.Speed.CarSpeedController;
/**
 *
 * @author argshub
 */
public class Car implements VehicleType {
    
    private SpeedController speed;
    private VehicleSwitch VehicleSwitch;
    private VehicleEngine engine;
    
    public Car() {
        this.engine = new CarEngine();
        this.VehicleSwitch = new CarSwitch(engine);
        this.speed = new CarSpeedController(engine);
    }
    
    @Override
    public void start() {
        this.VehicleSwitch.startEngine();
        System.out.println("Car Started");
    }
    
    
    @Override
    public void stop() {
        this.VehicleSwitch.stopEngine();
        System.out.println("Car Stopped");
    }
    
    @Override
    public void speedUp() {
        this.speed.changeSpeed(10);
    }
    
    @Override
    public void speedDown() {
        this.speed.changeSpeed(-10);
    }
    
    
    
}
