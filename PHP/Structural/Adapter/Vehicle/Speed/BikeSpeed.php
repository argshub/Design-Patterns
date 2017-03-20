<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:44 PM
 */

namespace Vehicle\Speed;


use Vehicle\Speed\Engine\BikeEngine;

class BikeSpeed implements VehicleSpeed
{

    private $engineController;

    private $speed;

    function __construct() {
        $this->engineController = new BikeEngine();
        $this->speed = 0;
    }

    function changeSpeed(int $speed) {
        if($speed === 0) $this->speed = 0;
        elseif($this->speed > 200) print "Speed Limit Exit";
        else {
            if ($this->engineController->changeSpin(50)) $this->speed += $speed;
        }
    }

    function getSpeed(): int {
        return $this->speed;
    }
}