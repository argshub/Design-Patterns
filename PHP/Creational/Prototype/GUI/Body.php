<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/27/2017
 * Time: 9:01 PM
 */

namespace GUI;


class Body extends GraphicalUserInterface
{
    private $height, $width, $content;

    function __construct(int $width, int $height) {
        $this->width = $width;
        $this->height = $height;
    }

    function setContent(string $content) {
        $this->content = $content;
    }

    function getContent() {
        return (string) $this->content;
    }

    function __clone() {}
}