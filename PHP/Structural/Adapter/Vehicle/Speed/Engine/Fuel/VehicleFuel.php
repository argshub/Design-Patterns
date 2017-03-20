<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:57 PM
 */

namespace Vehicle\Speed\Engine\Fuel;


interface VehicleFuel
{
    function supplyFuel(int $fuelAmount): bool ;
}