<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 7:31 PM
 */

namespace InputFactory;


class SubmitInput extends InputManager
{
    private $inputValue;

    function __construct(string $inputName, string $value) {
        parent::__construct($inputName);
        $this->inputValue = $value;
    }

    function getInputData(): string {
        return "\t<input type='submit' name='{$this->inputName}' value='{$this->inputValue}'/>\n";
    }
}