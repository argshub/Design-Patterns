<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 9:54 PM
 */

namespace Reader;


class FileReader
{
    private $filename;

    function __construct(string $filename) {
        $this->filename = $filename;
        print "Reading file name: {$filename}\n";
    }

    function readFileData() {
        print "file data: {$this->filename} \n";
    }
}