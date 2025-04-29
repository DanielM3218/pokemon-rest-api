package com.example.pokemon_api_final.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/api/**")  // Allow cross-origin requests for all API endpoints
            .allowedOrigins("http://localhost:5173")  // Allow only your React app
            .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow the methods you need
            .allowedHeaders("*")  // Allow all headers (optional)
            .allowCredentials(true)  // Allow credentials (cookies, etc.)
    }
}
