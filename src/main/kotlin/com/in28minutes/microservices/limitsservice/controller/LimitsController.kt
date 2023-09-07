package com.in28minutes.microservices.limitsservice.controller

import com.in28minutes.microservices.limitsservice.bean.Limits

import com.in28minutes.microservices.limitsservice.configuration.LimitConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class LimitsController(
    val limitConfiguration: LimitConfiguration
) {
    @GetMapping("/limits")
    fun limits(): Limits {
        return Limits(limitConfiguration.minimum, limitConfiguration.maximum)
    }
}