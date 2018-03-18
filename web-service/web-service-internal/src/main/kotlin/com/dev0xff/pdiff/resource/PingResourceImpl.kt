package com.dev0xff.pdiff.resource

import com.dev0xff.pdiff.api.PingApi
import org.springframework.stereotype.Component

@Component
class PingResourceImpl : PingApi {
    override fun ping(): String {
        return "{\"ping\": \"pong\"}"
    }
}