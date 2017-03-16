<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 5:31 PM
 */

namespace InputFactory;


class SelectInput extends InputManager
{
    private $selectData;

    function __construct($inputName, array $optionsData) {
        parent::__construct($inputName);
        $this->selectData = $optionsData;
    }

    function getInputData(): string {
        $select = "\t<select name='{$this->inputName}'>\n";
        foreach ($this->selectData as $selectDatum => $value) $select .= "\t\t<option value='{$selectDatum}'>{$value}</option>\n";
        $select .= "\t</select>\n";
        return $select;
    }

}