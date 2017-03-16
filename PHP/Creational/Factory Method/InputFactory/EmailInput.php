<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:31 PM
 */

namespace InputFactory;


class EmailInput extends InputManager
{
    function __construct($inputName) {
        parent::__construct($inputName);
    }

    function getInputData(): string {
        return "\t<input type='email' name='{$this->inputName}' placeholder='Enter Email Here'/>\n";
    }
}