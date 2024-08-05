package com.example.scratchpad.listener

import com.example.scratchpad.entity.EventVo
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class EventListener {

    @Async
    @EventListener
    fun customEventListener(eventVo: EventVo) {
        Thread.sleep(1000L);
        println("${Thread.currentThread()} : ${eventVo.message}")
    }

}