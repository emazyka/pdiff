package com.dev0xff.pdiff

import com.dev0xff.pdiff.resource.PingResourceImpl
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component
import javax.ws.rs.ApplicationPath

@Component
@ApplicationPath("/api")
class JerseyConfig : ResourceConfig {

    constructor() {
        register(PingResourceImpl::class)
    }
}