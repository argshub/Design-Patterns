<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 9:17 PM
 */

namespace AppleProducts;


use AppleProducts\Body\Body;
use AppleProducts\Body\LaptopBody;
use AppleProducts\CPU\CPU;
use AppleProducts\CPU\LaptopCPU;
use AppleProducts\Display\Display;
use AppleProducts\Display\LaptopDisplay;

class Laptop extends AppleProductFamily
{
    function CPU(): CPU {
        return new LaptopCPU();
    }

    function display(): Display {
        return new LaptopDisplay();
    }

    function body(): Body {
        return new LaptopBody();
    }

    function getSpecification(): string {
        return "It\'s Apple Laptop \n";
    }
}