package com.microsoft.hackathon.copilotdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/* 
* Create a GET operation to return the value of a key passed as query parameter. 
* If the key is not passed, return "key not passed".
* If the key is passed, return "hello <key>".
* 
*/
// This code creates a simple REST API endpoint that returns a "hello" string.
// It uses Spring MVC to configure a REST controller.
// It defines a single endpoint, /hello, that accepts a GET request with a query
// parameter named "key".
// It returns a string containing the value of the query parameter, prefixed with
// "hello ".

@RestController
public class DemoController {

    public String randomEmoji() {
        String[] emojilist = new String[128];
        for (int i = 0; i < 128; i++) {
            emojilist[i] = new String(Character.toChars(0x1F600 + i));
        }
        return emojilist[(int) (Math.random() * 128)];
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String key) {
        if (key == null) {
            throw new IllegalArgumentException("key not passed");
        }
        // result is the given input three times repeated and also add a funny random emoji
        String result = key + key + key + " " + randomEmoji();

        //return this result
        return result;
    }



}
