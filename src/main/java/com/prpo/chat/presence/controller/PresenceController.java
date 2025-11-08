package com.prpo.chat.presence.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/presence")
public class PresenceController {
    
    @GetMapping("/{id}")
    public String getUserstatius(@PathVariable String id) {
        return "User with id: " + id + " is online.";
    }
}
