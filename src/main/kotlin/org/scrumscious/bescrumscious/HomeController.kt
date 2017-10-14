package org.scrumscious.bescrumscious

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @RequestMapping ("/api/")
    fun start (): String {
        return "Hello Wtw"
    }

}