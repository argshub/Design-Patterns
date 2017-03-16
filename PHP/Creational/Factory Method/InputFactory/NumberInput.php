<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:30 PM
 */

namespace InputFactory;


class NumberInput extends InputManager
{
    function __construct($inputName) {
        parent::__construct($inputName);
    }

    function getInputData(): string {
        return "\t<input type='number' name='{$this->inputName}' placeholder='Enter Number Here'/>\n";
    }
}