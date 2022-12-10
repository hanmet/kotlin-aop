package com.kotlinaop.kotlinaop.domain

import org.springframework.stereotype.Service

@Service
class MyService {
    fun doSomething() {
        Thread.sleep(1_000)
    }
}