<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:44 PM
 */

namespace Vehicle\Speed;


use Vehicle\Speed\Engine\CarEngine;

class CarSpeed implements VehicleSpeed
{
    private $engineController;

    private $speed;

    function __construct() {
        $this->engineController = new CarEngine();
        $this->speed = 0;
    }

    function changeSpeed(int $speed) {
        if($speed === 0) $this->speed = 0;
        elseif($this->speed > 300) print "Speed Limit Exit";
        else {
            if ($this->engineController->changeSpin(100)) $this->speed += $speed;
        }
    }

    function getSpeed(): int {
        return $this->speed;
    }
}