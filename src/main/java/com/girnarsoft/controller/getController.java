package com.girnarsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getController {

    @RequestMapping("/api/v1/message")
    public String getMessage() {
        return "message from controller of microservice for docker -- first commit from github";
    }
}
