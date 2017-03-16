<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:20 PM
 */

namespace InputFactory;


abstract class InputManager
{
    protected $inputName;

    function __construct(string $inputName) {
        $this->inputName = $inputName;
    }

    abstract function getInputData(): string ;
}