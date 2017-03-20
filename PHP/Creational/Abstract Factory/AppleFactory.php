<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/20/2017
 * Time: 8:57 PM
 */

use AppleProducts\{IPhone, Watch, Laptop};

class AppleFactory
{
    static function product(string $name) {
        $product = null;
        switch (strtolower($name)) {
            case 'phone':
                    $product = new IPhone();
                break;
            case 'watch':
                    $product = new Watch();
                break;
            case 'laptop':
                    $product = new Laptop();
                break;
        }
        if($product) $product->assemble();
        return $product;
    }
}

spl_autoload_register(function($class) { require_once $class.".php";});

$phone = AppleFactory::product("phone");
print $phone->getSpecification();

$watch = AppleFactory::product("watch");
print $watch->getSpecification();

$laptop = AppleFactory::product("laptop");
print $laptop->getSpecification();