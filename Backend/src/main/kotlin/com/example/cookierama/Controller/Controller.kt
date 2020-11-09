package com.example.cookierama.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    companion object var counter: Int = 0

    @GetMapping(path = ["/count"])
    fun click(): Int {
        counter +=1
        return counter
    }

    @GetMapping(path = ["/countLikeAMonster"])
    fun clcikMonter(): Int {
        counter = Math.floor(counter * 1.2).toInt()
        return counter
    }

    @GetMapping(path = ["/count/get"])
    fun getCount(): Int {
        return counter
    }
}

