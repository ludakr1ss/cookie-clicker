package com.example.cookierama.Controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController

class Controller {
    companion object var counter:Int=0
    @GetMapping
    fun click(): Int{
        counter +=1
        return counter
    }
}
