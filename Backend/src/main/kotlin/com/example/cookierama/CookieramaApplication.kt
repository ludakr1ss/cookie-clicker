package com.example.cookierama

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
class CookieramaApplication

fun main(args: Array<String>) {
	runApplication<CookieramaApplication>(*args)
}

@Configuration
@EnableWebMvc
class CorsConfigurer: WebMvcConfigurer {
	override fun addCorsMappings(registry: CorsRegistry) {
		registry.addMapping("/**")
	}
}