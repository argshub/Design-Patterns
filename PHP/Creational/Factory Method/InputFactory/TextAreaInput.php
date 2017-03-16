<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:36 PM
 */

namespace InputFactory;


class TextAreaInput extends InputManager
{
    private $rowsNumber, $columnNumber;

    function __construct($inputName, $rowsNumber, $columnNumber) {
        parent::__construct($inputName);
        $this->rowsNumber = $rowsNumber;
        $this->columnNumber = $columnNumber;
    }

    function getInputData(): string {
        return "\t<textarea name='{$this->inputName}' rows='{$this->rowsNumber}' cols='{$this->columnNumber}' placeholder='Enter Big Text Here'></textarea>\n";
    }
}