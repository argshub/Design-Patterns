<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:55 PM
 */

namespace Vehicle\Speed\Engine;


interface VehicleEngine
{
    function __construct();
    function changeSpin(int $spinAmount): bool ;
}