<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:56 PM
 */

namespace Vehicle\Speed\Engine;


use Vehicle\Speed\Engine\Fuel\CarFuel;

class CarEngine implements VehicleEngine
{
    private $fuelController;

    private $spin;

    function __construct() {
        $this->fuelController = new CarFuel();
        $this->spin = 0;
    }

    function changeSpin(int $spinAmount): bool {
        if($this->spin > 3000) print "Spin Limit Exit";
        else {
            if($this->fuelController->supplyFuel(2)) {
                $this->spin += $spinAmount;
                return true;
            }
        }
        return false;
    }
}