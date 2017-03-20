<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 3:03 PM
 */

spl_autoload_register(function($class){ require_once $class.".php"; });

use Vehicle\{Car, Bike};

$car = new Car();
$car->start();
$car->speedUp();
$car->speedUp();
$car->speedUp();
$car->speedUp();
$car->speedUp();
$car->speedUp();
$car->speedUp();
$car->speedUp();
$car->speedDown();
$car->speedDown();
$car->stop();

print "\n\n\n\n";

$bike = new Bike();
$bike->start();
$bike->speedUp();
$bike->speedUp();
$bike->speedUp();
$bike->speedUp();
$bike->speedUp();
$bike->speedUp();
$bike->speedUp();
$bike->speedUp();
$bike->speedDown();
$bike->speedDown();
$bike->stop();