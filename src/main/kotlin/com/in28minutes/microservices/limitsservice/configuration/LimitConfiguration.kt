package com.in28minutes.microservices.limitsservice.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding
import org.springframework.context.annotation.Configuration


@ConfigurationProperties(prefix = "limits-service")
data class LimitConfiguration @ConstructorBinding constructor(
    val minimum: Int,
    val maximum: Int
)