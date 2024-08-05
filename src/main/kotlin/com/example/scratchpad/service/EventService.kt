package com.example.scratchpad.service

import com.example.scratchpad.entity.EventVo
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class EventService(
    private val applicationEventPublisher: ApplicationEventPublisher
) {

    fun send() {
        applicationEventPublisher.publishEvent(EventVo("Async Event"))
        println("과연 비동기로 실행이 될까?")
        println("비동기로 실행이 되나!?")
    }

}