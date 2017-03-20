<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 9:12 PM
 */

namespace AppleProducts;


use AppleProducts\Body\Body;
use AppleProducts\Body\PhoneBody;
use AppleProducts\CPU\CPU;
use AppleProducts\CPU\PhoneCPU;
use AppleProducts\Display\Display;
use AppleProducts\Display\PhoneDisplay;

class IPhone extends AppleProductFamily
{
    function CPU(): CPU {
        return new PhoneCPU();
    }

    function display(): Display {
        return new PhoneDisplay();
    }

    function body(): Body {
        return new PhoneBody();
    }

    function getSpecification(): string {
        return "It\'s Apple IPhone \n";
    }
}