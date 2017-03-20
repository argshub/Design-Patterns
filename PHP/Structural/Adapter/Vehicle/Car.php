<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:04 PM
 */

namespace Vehicle;


use Vehicle\Speed\CarSpeed;

class Car implements VehicleType
{
    private $speedController;
    function __construct() {
        $this->speedController = new CarSpeed();
    }

    function start() {
        $this->speedController->changeSpeed(5);
        printf("Car Started, Speed Meter::: %s \n", $this->getSpeed());
    }

    function speedUp() {
        $this->speedController->changeSpeed(10);
        printf("Car Speed Up, Speed Meter::: %s \n", $this->getSpeed());
    }

    function speedDown() {
        $this->speedController->changeSpeed(-10);
        printf("Car Speed Down, Speed Meter::: %s \n", $this->getSpeed());
    }

    function stop() {
        $this->speedController->changeSpeed(0);
        printf("Car Stopped, Speed Meter::: %s \n", $this->getSpeed());
    }

    function getSpeed(): int {
        return $this->speedController->getSpeed();
    }
}