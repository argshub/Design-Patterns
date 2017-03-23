<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 8:55 PM
 */
use URI\URIValidator;
use Routes\RouteValidator;
use Controller\ControllerAndMethodValidator;
use Middleware\MiddlewareValidator;
use Request\RequestProvider;

class Framework
{
    function __construct() {
        $this->uri = new URIValidator();
        $this->route = new RouteValidator();
        $this->controller = new ControllerAndMethodValidator();
        $this->middleware = new MiddlewareValidator();
        $this->request = new RequestProvider();
    }

    function start() {
        $this->uri->checkUri();
        $this->route->validateRoute($this->uri->getUri());
        $this->controller->validateControllerAndMethod($this->route->getControllerName(), $this->route->getMethodName());
        $this->middleware->checkMiddleware($this->route->getMiddleware());
        $this->request->passRequest($this->controller->getController(), $this->controller->getMethod(), $this->controller->getParams());
    }

    function stop() {
        $this->route->deleteRouteCache();
        $this->request->stopRequest();
    }
}

spl_autoload_register(function ($class){ require_once $class.".php"; });


$phpFramework = new Framework();
$phpFramework->start();print "\n";print "\n";
$phpFramework->stop();