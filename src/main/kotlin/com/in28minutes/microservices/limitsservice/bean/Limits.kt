package com.in28minutes.microservices.limitsservice.bean

import com.in28minutes.microservices.limitsservice.configuration.LimitConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties


class Limits(val minimum: Int, val maximum: Int) {

}