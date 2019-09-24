package com.dada.spring.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dada
 * @date 2019/9/24
 * @description
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
}
