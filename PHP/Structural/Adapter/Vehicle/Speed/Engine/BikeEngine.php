<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:57 PM
 */

namespace Vehicle\Speed\Engine;


use Vehicle\Speed\Engine\Fuel\BikeFuel;

class BikeEngine implements VehicleEngine
{
    private $fuelController;
    private $spin;

    function __construct() {
        $this->fuelController = new BikeFuel();
        $this->spin = 0;
    }

    function changeSpin(int $spinAmount): bool {
        if($this->spin > 2000) print "Spin Limit Exit";
        else {
            if($this->fuelController->supplyFuel(1)) {
                $this->spin += $spinAmount;
                return true;
            }
        }
        return false;
    }
}