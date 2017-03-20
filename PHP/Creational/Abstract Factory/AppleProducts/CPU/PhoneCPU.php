<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 9:07 PM
 */

namespace AppleProducts\CPU;


class PhoneCPU implements CPU
{
    function getCPU() {
        return "Phone CPU";
    }
}