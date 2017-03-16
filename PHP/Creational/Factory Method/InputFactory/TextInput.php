<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:28 PM
 */

namespace InputFactory;


class TextInput extends InputManager
{
    function __construct($inputName) {
        parent::__construct($inputName);
    }

    function getInputData(): string {
        return "\t<input type='text' name='{$this->inputName}' placeholder='Enter Text Here'/>\n";
    }
}