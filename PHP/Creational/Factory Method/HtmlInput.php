<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 6:20 PM
 */

use InputFactory\{EmailInput, NumberInput, PasswordInput, SelectInput, TextAreaInput, TextInput};

class HtmlInput
{
    static function inputs(string $formName, array $inputList) {
        $form = "<form name='{$formName}' action='' method='post'>\n";
        foreach ($inputList as $item => $value) {
            $input = null;
            switch (strtolower($item)) {
                case 'email':
                    $input = new EmailInput($value);
                    break;
                case 'number':
                    $input = new NumberInput($value);
                    break;
                case 'password':
                    $input = new PasswordInput($value);
                    break;
                case 'select':
                    if(is_array($value)) {
                        $name = $value['name'] ? $value['name'] : "";
                        $options = $value['options'] ? $value['options'] : [];
                        $input = new SelectInput($name, $options);
                    } else $input  = new SelectInput($value, []);
                    break;
                case 'textarea':
                    if(is_array($value)) {
                        $name = $value['name'] ? $value['name'] : "";
                        $rows = $value['rows'] ? $value['rows'] : 5;
                        $cols = $value['cols'] ? $value['cols'] : 5;
                        $input = new TextAreaInput($name, $rows, $cols);
                    } else $input = new TextAreaInput($value, 5, 5);
                    break;
                default:
                    $input = new TextInput($value);
                    break;
            }
            $form .= $input->getInputData();
        }
        $form .= "</form>";
        return $form;
    }
}