package com.prpo.chat.presence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/presence")
public class PresenceController {
    
    @GetMapping("/{id}")
    public String getUserstatius(@PathVariable String id) {
        return "User with id: " + id + " is online.";
    }
}
