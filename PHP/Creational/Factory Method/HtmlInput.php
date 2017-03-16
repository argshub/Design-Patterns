<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/16/2017
 * Time: 6:20 PM
 */


use InputFactory\{EmailInput, NumberInput, PasswordInput, SelectInput, TextAreaInput, TextInput, NullInput, SubmitInput};

class HtmlInput
{
    static function inputs(string $formName, array $inputList) {
        $form = "<form name='{$formName}' action='' method='post'>\n";
        foreach ($inputList as $item) {
            $input = null;
            $type = isset($item['type']) ? $item['type'] : "";
            $name = isset($item['name']) ? $item['name'] : "";
            $value = isset($item['value']) ? $item['value'] : "";
            switch (strtolower($type)) {
                case 'email':
                    $placeholder = isset($item['placeholder']) ? $item['placeholder'] : "Enter Your Email";
                    $input = new EmailInput($name, $value, $placeholder);
                    break;
                case 'number':
                    $placeholder = isset($item['placeholder']) ? $item['placeholder'] : "Enter Your Number";
                    $input = new NumberInput($name, $value, $placeholder);
                    break;
                case 'password':
                    $placeholder = isset($item['placeholder']) ? $item['placeholder'] : "Enter Your Password";
                    $input = new PasswordInput($name, $value, $placeholder);
                    break;
                case 'select':
                    $options = isset($item['options']) ? $item['options'] : [];
                    $input = new SelectInput($name, $options);
                    break;
                case 'textarea':
                    $rows = isset($item['rows']) ? $item['rows'] : 5;
                    $cols = isset($item['cols']) ? $item['cols'] : 5;
                    $input = new TextAreaInput($name, $rows, $cols);
                    break;
                case 'text':
                    $placeholder = isset($item['placeholder']) ? $item['placeholder'] : "Enter Your Text";
                    $input = new TextInput($name, $value, $placeholder);
                    break;
                case 'submit':
                    $input = new SubmitInput($name, $value);
                    break;
                default:
                    $input = new NullInput();
                    break;
            }
            $form .= $input->getInputData();
        }
        $form .= "</form>";
        return $form;
    }
}


spl_autoload_register(function($class) { require_once $class.'.php'; });


print HtmlInput::inputs("myForm", [
   ['type' => 'text', 'name' => 'firstName', 'placeholder' => 'Enter Your First Name'],
   ['type' => 'text', 'name' => 'lastName', 'placeholder' => 'Enter Your LastName'],
   ['type' => 'number', 'name' => 'phoneNumber', 'placeholder' => 'Enter Your Phone Number'],
   ['type' => 'email', 'name' => 'userEmail', 'placeholder' => 'Enter Your Valid Email'],
   ['type' => 'select', 'name' => 'gender', 'options' => [0 => 'Male', 1 => 'Female', 2 => 'Others']],
   ['type' => 'textarea', 'name' => 'gender', 'rows' => 10, 'cols' => 10],
   ['type' => 'submit', 'value' => 'Submit']
]);