<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 9:19 PM
 */

namespace AppleProducts;


use AppleProducts\Body\Body;
use AppleProducts\Body\WatchBody;
use AppleProducts\CPU\CPU;
use AppleProducts\CPU\WatchCPU;
use AppleProducts\Display\Display;
use AppleProducts\Display\WatchDisplay;

class Watch extends AppleProductFamily
{
    function CPU(): CPU {
        return new WatchCPU();
    }

    function display(): Display {
        return new WatchDisplay();
    }

    function body(): Body {
        return new WatchBody();
    }

    function getSpecification(): string {
        return "It\'s Apple Watch \n";
    }
}