<?php

/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/27/2017
 * Time: 8:57 PM
 */

use GUI\{Header, Footer, Body};

class Template
{
    private $header, $footer, $body;

    private $templateName;

    function __construct(string $name) {
        $this->templateName = $name;
    }

    function setHeader(Header $header) {
        $this->header = $header;
    }

    function setBody(Body $body) {
        $this->body = $body;
    }

    function setFooter(Footer $footer) {
        $this->footer = $footer;
    }

    function getTemplate() {
        return sprintf("Name: %s => \nHeader: %s \nBody: %s \nFooter: %s\n", $this->getTemplateName(), $this->header->getContent(), $this->body->getContent(), $this->footer->getContent());
    }

    public function getTemplateName(): string {
        return $this->templateName;
    }
}

spl_autoload_register(function ($class) { require_once $class.".php"; });

$template = new Template("Dracula");
$header = new Header(200, 100);
$header->setContent("Header Content");
$body = new Body(200, 500);
$body->setContent("Body Content");
$footer = new Footer(200, 50);
$footer->setContent("Footer Content");
$template->setHeader($header);
$template->setBody($body);
$template->setFooter($footer);
print $template->getTemplate();print "\n\n";

$template1 = new Template("Twilight");
$cloneHeader = clone $header;
$cloneHeader->setContent("Clone: Another Head Content");
$cloneBody = clone $body;
$cloneBody->setContent("Clone: Another Body Content");
$cloneFooter = clone $footer;
$cloneFooter->setContent("Clone: Another Foot Content");
$template1->setHeader($cloneHeader);
$template1->setBody($cloneBody);
$template1->setFooter($cloneFooter);
print $template1->getTemplate();





