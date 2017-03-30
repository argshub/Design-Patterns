<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/27/2017
 * Time: 5:12 PM
 */

namespace GUI;


abstract class GraphicalUserInterface
{
    abstract function setContent(string $content);
    abstract function __clone();
}