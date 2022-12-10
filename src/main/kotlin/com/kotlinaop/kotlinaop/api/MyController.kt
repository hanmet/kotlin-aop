package com.kotlinaop.kotlinaop.api

import com.kotlinaop.kotlinaop.domain.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.logging.Logger

@RestController
class MyController(
    val myService: MyService
) {

    companion object {
        val log: Logger = Logger.getLogger(MyController::class.java.name)
    }


    @GetMapping("first")
    fun first() {
        log.info("Inside of first rest endpoint")
        myService.doSomething()
    }

    @GetMapping("second")
    fun second() {
        log.info("Inside of second rest endpoint")
    }
}