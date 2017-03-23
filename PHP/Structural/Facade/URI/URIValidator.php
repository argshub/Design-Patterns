<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 9:02 PM
 */

namespace URI;


class URIValidator
{
    private $uri;

    function checkUri() {
        $this->uri = isset($_GET['uri']) ? $_GET['uri'] : "/";
        print "Checking URI\n";
    }

    function getUri() {
        return $this->uri;
    }
}