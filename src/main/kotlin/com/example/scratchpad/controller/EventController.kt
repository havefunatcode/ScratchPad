package com.example.scratchpad.controller

import com.example.scratchpad.service.EventService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EventController(
    private val eventService: EventService
) {

    @GetMapping("/event")
    fun event() {
        eventService.send();
    }

}