<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:07 PM
 */

namespace Vehicle;


interface VehicleType
{
    function start();
    function speedUp();
    function speedDown();
    function stop();
    function getSpeed(): int ;
}