<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:05 PM
 */

namespace Vehicle;


use Vehicle\Speed\BikeSpeed;
use Vehicle\Speed\VehicleSpeed;


class Bike implements VehicleType
{
    private $speedController;

    function __construct() {
        $this->speedController = new BikeSpeed();
    }

    function start() {
        $this->speedController->changeSpeed(5);
        printf("Bike Started, Speed Meter::: %s \n", $this->getSpeed());
    }

    function speedDown() {
        $this->speedController->changeSpeed(-10);
        printf("Bike Speed Up, Speed Meter::: %s \n", $this->getSpeed());
    }

    function speedUp() {
        $this->speedController->changeSpeed(10);
        printf("Bike Speed Down, Speed Meter::: %s \n", $this->getSpeed());
    }

    function stop() {
        $this->speedController->changeSpeed(0);
        printf("Bike Stopped, Speed Meter::: %s \n", $this->getSpeed());
    }

    function getSpeed(): int {
        return $this->speedController->getSpeed();
    }
}