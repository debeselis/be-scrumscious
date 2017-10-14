package org.scrumscious.bescrumscious

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class MainController {

    @RequestMapping(
            value = "/",
            method = arrayOf(RequestMethod.GET)
    )
    fun index(): String {
        return "index"
    }

}