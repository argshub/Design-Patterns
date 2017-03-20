<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 8:59 PM
 */

namespace AppleProducts;


use AppleProducts\CPU\CPU;
use AppleProducts\Display\Display;
use AppleProducts\Body\Body;

abstract class AppleProductFamily
{
    abstract function CPU(): CPU;
    abstract function display(): Display;
    abstract function body(): Body;


    function assemble() {
        $this->CPU()->getCPU();
        $this->display()->getDisplay();
        $this->body()->getBody();
    }

    abstract function getSpecification(): string ;
}