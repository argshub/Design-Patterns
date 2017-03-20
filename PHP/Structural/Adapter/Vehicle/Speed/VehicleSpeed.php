<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:12 PM
 */

namespace Vehicle\Speed;


interface VehicleSpeed
{
    function getSpeed(): int ;
    function changeSpeed(int $speed);
}