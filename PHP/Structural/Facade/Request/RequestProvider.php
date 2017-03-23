<?php
/**
 * Created by PhpStorm.
 * User: argshub
 * Date: 3/23/2017
 * Time: 9:07 PM
 */

namespace Request;


class RequestProvider
{

    public function passRequest($getController, $getMethod, $getParams) {
        print "Serving request for controller: {$getController}, method: {$getMethod} and params: ";
        //call_user_func_array([$getController, $getMethod], $getParams);
    }

    public function stopRequest() {
        print "Stopping all Request service";
    }
}