<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:38 PM
 */

namespace InputFactory;


class PasswordInput extends InputManager
{
    function __construct($inputName) {
        parent::__construct($inputName);
    }

    function getInputData(): string {
        return "\t<input type='password' name='{$this->inputName}' placeholder='Enter Password Here'/>\n";
    }
}