<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 7:26 PM
 */

namespace InputFactory;


class NullInput extends InputManager
{
    function __construct() {
        parent::__construct("");
    }

    function getInputData(): string {
        return "";
    }
}