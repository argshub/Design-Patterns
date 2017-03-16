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
    private $inputValue, $placeholder;

    function __construct(string $inputName, string $value, string $placeholder) {
        parent::__construct($inputName);
        $this->inputValue = $value;
        $this->placeholder = $placeholder;
    }

    function getInputData(): string {
        return "\t<input type='email' name='{$this->inputName}' value='{$this->inputValue}' placeholder='{$this->placeholder}'/>\n";
    }
}