<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 9:51 PM
 */

use Reader\FileReader;

class Reader
{
    private static $instance;

    static function readData(string $filename) {
        return self::$instance ? self::$instance : self::$instance = new FileReader($filename);
    }

}

spl_autoload_register(function ($class){ require_once $class.".php"; });

$fileData = Reader::readData("index")->readFileData();
$fileData = Reader::readData("index")->readFileData();
$fileData = Reader::readData("index")->readFileData();
$fileData = Reader::readData("index")->readFileData();