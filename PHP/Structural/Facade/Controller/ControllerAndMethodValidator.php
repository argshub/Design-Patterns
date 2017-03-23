<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 9:03 PM
 */

namespace Controller;


class ControllerAndMethodValidator
{
    private $controller, $method;
    private $params;

    function validateControllerAndMethod(string $controller, string $method) {
        print "Validating Controller- {$controller} and method - {$method} existance\n";
        $this->controller = $controller;
        $this->method = $method;
        $this->params = ["argshub", 64748];
    }

    public function getController() {
        return $this->controller;
    }

    public function getMethod() {
        return $this->method;
    }

    public function getParams() {
        return $this->params;
    }
}