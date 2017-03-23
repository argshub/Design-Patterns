<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 9:03 PM
 */

namespace Routes;


class RouteValidator
{
    private $controller, $method;
    private $middleware;

    function __construct() {
        $this->controller = "HomeController";
        $this->method = "index";
        $this->middleware = "auth";
    }

    function validateRoute(string $uri) {
        print "Checking Route Existance for {$uri} \n";
    }

    public function getControllerName(): string {
        return $this->controller;
    }

    public function getMethodName(): string {
        return $this->method;
    }

    public function getMiddleware(): string {
        return $this->middleware;
    }

    public function deleteRouteCache() {
        print "Removing route cache\n ";
    }
}