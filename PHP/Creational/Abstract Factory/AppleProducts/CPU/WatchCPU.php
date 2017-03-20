<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 9:09 PM
 */

namespace AppleProducts\CPU;


class WatchCPU implements CPU
{
    function getCPU() {
        return "Watch CPU";
    }
}