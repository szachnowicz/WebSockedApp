package com.szachnowicz.WebSockedApp.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
@CrossOrigin
public class SimplyController {

    @RequestMapping(value = "/simply", method = RequestMethod.POST)
    public String simply() {
        return "simply";
    }


}
