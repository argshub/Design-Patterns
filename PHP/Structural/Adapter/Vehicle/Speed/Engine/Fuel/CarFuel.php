<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:58 PM
 */

namespace Vehicle\Speed\Engine\Fuel;


class CarFuel implements VehicleFuel
{
    private $fuelAmount;

    function __construct() {
        $this->fuelAmount = 200;
    }

    function supplyFuel(int $fuelAmount): bool {
        if($this->fuelAmount < 5) print "Not Enough Fuel";
        else {
            $this->fuelAmount -= $fuelAmount;
            return true;
        }
        return false;
    }
}