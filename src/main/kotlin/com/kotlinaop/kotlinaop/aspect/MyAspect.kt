package com.kotlinaop.kotlinaop.aspect

import com.kotlinaop.kotlinaop.api.MyController
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.context.annotation.Configuration
import java.util.logging.Logger


@Configuration
@Aspect
class MyAspect {

    companion object {
        val log: Logger = Logger.getLogger(MyController::class.java.name)
    }


    @Before("execution(* com.kotlinaop.kotlinaop.api.MyController.first())")
    fun beforeRestCall() {
        log.info("Before rest call gets executed")
    }

    @After("execution(* com.kotlinaop.kotlinaop.api.MyController.first())")
    fun afterRestCall() {
        log.info("After rest call got executed")
    }

    @After("execution(* com.kotlinaop.kotlinaop.api.MyController.*())")
    fun afterEveryRestCall() {
        log.info("After every rest call")
    }

    @Around("execution(* com.kotlinaop.kotlinaop.api.MyController.first())")
    fun around(joinPoint: ProceedingJoinPoint) {
        val startTime = System.currentTimeMillis()
        joinPoint.proceed()
        val timeTaken = System.currentTimeMillis() - startTime
        log.info("Time Taken by $joinPoint is $timeTaken")
    }


}